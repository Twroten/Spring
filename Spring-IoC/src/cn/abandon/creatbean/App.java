package cn.abandon.creatbean;

import cn.abandon.creatbean.constructor.Cat1;
import cn.abandon.creatbean.factory_bean.Cat4;
import cn.abandon.creatbean.instance_factory.Cat3;
import cn.abandon.creatbean.static_factory.Cat2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private Cat1 c1;
    @Autowired
    private Cat2 c2;
    @Autowired
    private Cat3 c3;
    @Autowired
    private Cat4 c4;
    @Autowired
    private Cat4 c44;


    @Test
    void test1Constructor() {
        System.out.println(c1);
    }

    @Test
    void test2StaticFactory() {
        System.out.println(c2);
    }

    @Test
    void test3InstanceFactory() {
        System.out.println(c3);
    }

    @Test
    void test4InstanceFactory() {
        System.out.println(c4);
        System.out.println(c44);
    }
}
