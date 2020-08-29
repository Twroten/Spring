package cn.abandon.spring_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class SpringJUnitTest {
    @Autowired
    private SomeBean bean;

    @Test
    void testSpringJUnit5() {
        bean.doWork();
    }

}
