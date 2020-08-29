package cn.abandon.spring_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:cn/abandon/spring_test/SpringJUnitTest-context.xml")
@ContextConfiguration
public class SpringJUnitTest_JUnit4 {
    @Autowired
    private SomeBean someBean;

    @Test
    public void testSpringTest() {
        someBean.doWork();
    }
}
