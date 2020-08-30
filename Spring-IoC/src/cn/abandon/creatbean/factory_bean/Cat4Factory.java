package cn.abandon.creatbean.factory_bean;

import cn.abandon.creatbean.instance_factory.Cat3;
import org.springframework.beans.factory.FactoryBean;

public class Cat4Factory implements FactoryBean<Cat4> {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Cat4 getObject() throws Exception {
        Cat4 c4 = new Cat4();
        System.out.println("username:"+username);
        return c4;
    }

    @Override
    public Class<?> getObjectType() {
        return Cat4.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
