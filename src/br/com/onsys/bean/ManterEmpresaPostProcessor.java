package br.com.onsys.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class ManterEmpresaPostProcessor implements BeanFactoryPostProcessor
{
    private static final String SERIALIZATION_ID = "4086d293-966c-4d89-8485-f1c1f5c09218";
    
    public void postProcessBeanFactory(final ConfigurableListableBeanFactory beanFactory) throws BeansException {
        if (beanFactory instanceof DefaultListableBeanFactory) {
            final DefaultListableBeanFactory dlbf = (DefaultListableBeanFactory)beanFactory;
            dlbf.setSerializationId("4086d293-966c-4d89-8485-f1c1f5c09218");
        }
    }
}