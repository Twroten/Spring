package cn.abandon.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContainerTest {

    @Autowired
    private Person person;
    @Autowired
    private Employee employee;

    @Autowired
    private BeanFactory factory;
    @Autowired
    private ApplicationContext ctx;

    @Test
    void testSpringJUnit() {
        System.out.println(person);
        System.out.println(employee);
        System.out.println(factory);
        System.out.println(ctx);
    }

}
