package com.workintech.developers;
public class Employee {
    private long id;
    private String name;
    private double salary;

    // 🔹 Üç parametreli constructor (sorunu çözen kısım)
    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(long id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee starts working");
    }

    public String getName() {
        return name;
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
