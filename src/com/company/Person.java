package com.company;

public abstract class Person implements IPayable, Comparable<Person>{
    protected static int id_gen = 1;
    protected int id;
    protected String name, surname;


    Person(){
    this.id = id_gen++;
    }
    public Person(String name, String surname){
    this();
    setName(name);
    setSurname(surname);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getPosition(String position){
        return position;
    }
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return getId() + ". " + getName() + " " + getSurname() +  " earns " + getPaymentAmount() + " tenge\n";
    }
    @Override
    public int compareTo(Person a) {
        if (this.getPaymentAmount() - a.getPaymentAmount() < 0)
            return -1;
        else if (this.getPaymentAmount() - a.getPaymentAmount()== 0)
                return 0;
        else
            return 1;
    }
    public int exam(int i){
        return i++;
    }
}
