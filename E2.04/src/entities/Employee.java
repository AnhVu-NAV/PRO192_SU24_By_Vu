/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author IDEAPAD
 */
public class Employee {
    private String id;
    private String name;
    private int salary;
    private double coefficientsSalary;

    public Employee() {
    }

    public Employee(String id, String name, int salary, double coefficientsSalary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }
    
    public double calculateSalary(){
        return this.salary + this.salary * this.coefficientsSalary;
    }

    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", name=" + name + ", salary=" + salary + 
                ", coefficientsSalary=" + coefficientsSalary + ']';
    }
    
    
}
