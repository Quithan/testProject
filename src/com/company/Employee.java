package com.company;

public class Employee extends Person{
//    private static int id_gen = 0;
//    private int id;
//    private String name, surname, position;
    private String position;
    private double salary;

    Employee(){
        super();
    }
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public double getPaymentAmount(){
        return getSalary();
    }

    @Override
    public String toString(){
        return "Employee : " + super.toString();
    }


}
