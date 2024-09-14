package com.lld.creational.design.pattern.singleton;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee e1=Employee.getEmployee();
        Employee e2=Employee.getEmployee();
        //compare the hashcode of the both objects, if equal means same else different objects
        System.out.println(e1.hashCode()==e2.hashCode()); // true.

        //let's try to clone it which will break the concept of singleton
        Employee e3=(Employee)e1.clone();
        System.out.println("Comparing with clone: " + (e2.hashCode()==e3.hashCode()));
    }
}
