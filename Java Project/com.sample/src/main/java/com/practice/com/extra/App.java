package com.practice.com.extra;

public class App 
{
    public static void main( String[] args )
    {
        Employee emp1 = new Employee();
        System.out.println(emp1);
        emp1.setEmpId(1);
        emp1.setEmpName("Priya");
        emp1.setDesignation("SDE I");
        emp1.setMobileNum("97790796540");
        
        System.out.println(emp1);
        
        Employee emp2 = new Employee("Pavithra",2,"SDE II","7305254546");
        System.out.println(emp2);
        
        
    }
}
