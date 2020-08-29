package cn.abandon.container;

import java.math.BigDecimal;

public class Employee {
    private Integer id;
    private String name;
    private BigDecimal salary;

    public Employee() {
        System.out.println("构建Employee...");
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
