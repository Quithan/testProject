package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        Employee employee1 = new Employee("John", "Lenon", "IT specialist", 27045.78 );
        person.add(employee1);
        
        Employee employee2 = new Employee("George", "Harrison", "Doctor", 50000.00);
        person.add(employee2);

        Student student1 = new Student("Ringo", " Starr", 2.5);
        person.add(student1);

        Student student2 = new Student("Paul", " McCartney", 3.1);
        person.add(student2);

        Collections.sort(person);
        printData(person);


    }
    public static void printData(Iterable<Person> person){
        for (Object el : person){
            System.out.println(el);
        }
    }
}





//    String name = scanner.nextLine();
//    String surname = scanner.nextLine();
//    String position = scanner.nextLine();
//    double salary = scanner.nextDouble();


//        name = scanner.nextLine();
//        surname = scanner.nextLine();
//        position = scanner.nextLine();
//        double gpa = scanner.nextDouble();