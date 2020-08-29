package cn.abandon.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class App {
    @Test
    void testBeanFactory() {
        Resource resource = new ClassPathResource("cn/abandon/container/ContainerTest-context.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        System.out.println("----------------------------");
        Person person = factory.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    void testApplicationContext() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("cn/abandon/container/ContainerTest-context.xml");
        System.out.println("----------------------------");
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);
    }
}
