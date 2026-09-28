package com.example;

public class SimpleEmployee {
    private String name;
    private String city;
    private int salary;
    private int positionId;

    public SimpleEmployee() {
    }
    public SimpleEmployee(String name, String city, int salary, int positionId) {
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.positionId = positionId;
    }

    @Override 
    public String toString() {
        return "\n" + name + " " + city + " " + salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getPositionId() {
        return positionId;
    }
    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

        
}
