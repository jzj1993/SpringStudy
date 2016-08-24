/**
 * Copyright_2006, Liao Xuefeng
 * Created on 2006-3-9
 * For more information, please visit: http://www.crackj2ee.com
 */
package com.jzj.example.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) throws Exception {
        // init factory:
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        // use service bean:
        ServiceBean service = (ServiceBean) factory.getBean("service");
        service.addUser("bill", "hello");
        service.addUser("tom", "goodbye");
        service.addUser("tracy", "morning");
        System.out.println("tom's password is \"" + service.getPassword("tom") + "\"");
        if (service.findUser("tom")) {
            service.deleteUser("tom");
        }
        service.deleteUser("not-exist");

        // close factory:
        factory.destroySingletons();
    }
}
