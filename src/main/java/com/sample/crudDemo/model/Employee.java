package com.sample.crudDemo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "position")
    private String position;

    @Column(name = "company")
    private String company;

    @Column(name = "salary")
    private double salary;

    // zero-arg constructor
    public Employee() {
    }

    // parameterized constructor
    public Employee(long id, String name, String position, String company, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.company = company;
        this.salary = salary;
    }

    // Getter methods
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString() method
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", company=" + company
                + ", salary=" + salary + "]";
    }
}
