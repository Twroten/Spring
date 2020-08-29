package cn.abandon.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.util.Properties;


public class HelloWorldDemo {

    @Test
    public void testOld() {
        HelloWorld world = new HelloWorld();
        world.setUsername("Anthony");
        world.setAge(17);
        world.sayHello();
    }

    @Test
    public void testIoC() throws Exception {
        HelloWorld world = null;
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        //        world = (HelloWorld) factory.getBean("helloWorld");
        //        world = factory.getBean(HelloWorld.class);
        world = factory.getBean("helloWorld", HelloWorld.class);
        world.sayHello();

    }

    @Test
    public void testIoCMock() throws Exception {
        String className = "cn.abandon.hello.HelloWorld";

        Class clazz = Class.forName(className);
        Constructor con = clazz.getConstructor();
        con.setAccessible(true);
        Object obj = con.newInstance();
        BeanInfo beanInfo = Introspector.getBeanInfo(clazz, Object.class);
        PropertyDescriptor pds[] = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor pd :
                pds) {
            String propertyName = pd.getName();
            if ("username".equals(propertyName)) {
                pd.getWriteMethod().invoke(obj, "Wroten");
            } else if ("age".equals(propertyName)) {
                pd.getWriteMethod().invoke(obj, 18);
            }
        }
        HelloWorld world = (HelloWorld) obj;
        world.sayHello();
    }
}
