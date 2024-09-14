package com.lld.creational.design.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        Employee e1=Employee.getEmployee();
        Employee e2=Employee.getEmployee();
        //compare the hashcode of the both objects, if equal means same else different objects
        System.out.println(e1.hashCode()==e2.hashCode()); // true.
    }
}
