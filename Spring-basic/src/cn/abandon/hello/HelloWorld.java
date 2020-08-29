package cn.abandon.hello;

public class HelloWorld {
    private String username;
    private Integer age;

    //private HelloWorld(){}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("欢迎来到Spring!" + username + ". age:" + age);
    }
}
