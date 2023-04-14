package Inheritance.practice_1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String arg[]) {

// double salary = na.getMonthlySalary(); will give a compiler error because its located in the childs class
        Employee employee = new SalariedEmployee("Kris", 35.6);
        String name = employee.getName();
        System.out.println(name);


        // object to access child class object
        SalariedEmployee na = new SalariedEmployee("Kris", 35.6);
        double salary = na.getMonthlySalary();
        System.out.println(salary);
    }
}
