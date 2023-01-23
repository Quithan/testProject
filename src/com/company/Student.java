package com.company;

public class Student extends Person {
//    private static int id_gen = 0;
//    private int id;
//    //private String name, surname;
    private double gpa;
    Student(){
        super();
    }
    Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public double getGpa() {
        return gpa;
    }


    public double getPaymentAmount(){
        return getGpa() > 2.67 ? 36660.0 : 0.0;
    }
    @Override
    public String toString(){
        return "Student : " + super.toString();
    }


}
