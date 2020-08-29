package cn.abandon.container;


public class Person {
    Person() {
        System.out.println("构建 Person...");
    }

    ;
    Integer id;
    String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
