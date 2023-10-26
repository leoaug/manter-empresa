package br.com.bb.amb.tecnotour.config;

import javax.naming.NamingException;
import org.springframework.jndi.JndiTemplate;
import javax.sql.DataSource;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.jmx.export.annotation.AnnotationMBeanExporter;
import java.util.Properties;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.instrument.classloading.ReflectiveLoadTimeWeaver;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import br.com.bb.amb.sadc.modelo.persistencia.util.SadcLocalContainerEntityManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TecnotourJpaConfig
{
    @Bean(name = { "transactionManagerTecnotour" })
    @Primary
    public PlatformTransactionManager transactionManager() throws Exception {
        try {
            return (PlatformTransactionManager)new JpaTransactionManager(this.entityManagerFactory().getObject());
        }
        catch (Exception e) {
            throw e;
        }
    }
    
    @Bean(name = { "entityManagertecnotour" })
    public SadcLocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
        try {
            final SadcLocalContainerEntityManagerFactoryBean factoryBean = new SadcLocalContainerEntityManagerFactoryBean();
            factoryBean.setPersistenceUnitName("tecnotour");
            factoryBean.setDataSource(this.dataSource());
            this.eclipseLinkConfig(factoryBean);
            factoryBean.setPackagesToScan(new String[] { "br.com.bb.amb.tecnotour.modelo.entidade","br.com.bb.amb.sadc.modelo.entidade" });
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
        return prop;
    }
    
    @Bean
    public AnnotationMBeanExporter annotationMBeanExporter() {
        final AnnotationMBeanExporter annotationMBeanExporter = new AnnotationMBeanExporter();
        annotationMBeanExporter.addExcludedBean("dataSourceTecnotour");
        annotationMBeanExporter.setRegistrationPolicy(RegistrationPolicy.IGNORE_EXISTING);
        return annotationMBeanExporter;
    }
    
    @Bean(name = { "dataSourceTecnotour" })
    public DataSource dataSource() throws NamingException {
        return (DataSource)new JndiTemplate().lookup("java:comp/env/jdbc/tecnotourDS");
    }
}