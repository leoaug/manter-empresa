package br.com.onsys.config;

import java.util.Properties;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.instrument.classloading.ReflectiveLoadTimeWeaver;
import org.springframework.jmx.export.annotation.AnnotationMBeanExporter;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import br.com.bb.amb.sadc.modelo.persistencia.util.SadcLocalContainerEntityManagerFactoryBean;
import br.com.onsys.constants.ManterEmpresaConstant;

@Configuration
public class ManterEmpresaJpaConfig {
    @Bean(name = { ManterEmpresaConstant.TRANSACTION_MANAGER_MANTER_EMPRESA })
    @Primary
    public PlatformTransactionManager transactionManager() throws Exception {
        try {
            return (PlatformTransactionManager)new JpaTransactionManager(this.entityManagerFactory().getObject());
        }
        catch (Exception e) {
            throw e;
        }
    }
    
    @Bean(name = { ManterEmpresaConstant.ENTITY_MANAGER_MANTER_EMPRESA })
    public SadcLocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
        try {
            final SadcLocalContainerEntityManagerFactoryBean factoryBean = new SadcLocalContainerEntityManagerFactoryBean();
            factoryBean.setPersistenceUnitName(ManterEmpresaConstant.PERSISTENCE_UNIT_MANTER_EMPRESA);
            factoryBean.setDataSource(this.dataSource());
            this.eclipseLinkConfig(factoryBean);
            factoryBean.setPackagesToScan(new String[] { ManterEmpresaConstant.PACKAGE_SCAN_MODEL_EMPRESA });
            return factoryBean;
        }
        catch (Exception e) {
            throw e;
        }
    }
    
    private void eclipseLinkConfig(final SadcLocalContainerEntityManagerFactoryBean factoryBean) {
        factoryBean.setJpaVendorAdapter((JpaVendorAdapter)new EclipseLinkJpaVendorAdapter());
        factoryBean.setJpaProperties(this.getPropertiesEclipseLink());
        factoryBean.setLoadTimeWeaver((LoadTimeWeaver)new ReflectiveLoadTimeWeaver());
    }
    
    private Properties getPropertiesEclipseLink() {
        final Properties prop = new Properties();
        prop.setProperty("eclipselink.logging.level", "severe");
        prop.setProperty("eclipselink.logging.level.cache", "FINE");
        prop.setProperty("eclipselink.logging.level.sql", "ALL");
        prop.setProperty("eclipselink.logging.parameters", "true");
        prop.setProperty("eclipselink.query-results-cache", "false");
        prop.setProperty("eclipselink.flush-clear.cache", "Drop");
        prop.setProperty("eclipselink.cache.shared.default", "false");
        prop.setProperty("eclipselink.ddl-generation","create-or-extend-tables");
        //prop.setProperty("eclipselink.validation.mode","AUTO");
        return prop;
    }
    
    @Bean
    public AnnotationMBeanExporter annotationMBeanExporter() {
        final AnnotationMBeanExporter annotationMBeanExporter = new AnnotationMBeanExporter();
        annotationMBeanExporter.addExcludedBean(ManterEmpresaConstant.DATA_SOURCE_MANTER_EMPRESA);
        annotationMBeanExporter.setRegistrationPolicy(RegistrationPolicy.IGNORE_EXISTING);
        return annotationMBeanExporter;
    }
    
    @Bean(name = { ManterEmpresaConstant.DATA_SOURCE_MANTER_EMPRESA })
    public DataSource dataSource() throws NamingException {
        return (DataSource)new JndiTemplate().lookup("java:comp/env/" + ManterEmpresaConstant.DATA_SOURCE_MANTER_EMPRESA_URL);
    }
}