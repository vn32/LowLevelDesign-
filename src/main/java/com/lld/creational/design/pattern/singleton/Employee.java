package com.lld.creational.design.pattern.singleton;

public class Employee {
    private static Employee employee;
    private Employee(){
        //so that no any other class outside of this can create the object
    }
    //method to get the employee object
    public static Employee getEmployee(){
        if(employee==null){
            employee=new Employee();
        }
        return employee;
    }
}
