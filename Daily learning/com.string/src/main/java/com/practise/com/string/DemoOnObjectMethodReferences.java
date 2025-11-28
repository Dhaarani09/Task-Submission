package com.practise.com.string;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double getSalaryWithBonus(double bonusPercent) {
        return salary + (salary * bonusPercent / 100);
    }
}

public class DemoOnObjectMethodReferences {
    

    public static boolean validatePassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return password.matches(regex);
    }

    public static void main(String[] args) {
      
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Charlie", "Andrew");

        Predicate<String> startsWithA = s -> s.startsWith("A");
        Predicate<String> longerThan3 = s -> s.length() > 3;

        List<String> result = names.stream()
                                   .filter(startsWithA.and(longerThan3))
                                   .collect(Collectors.toList());

        System.out.println("Filtered Names: " + result); 

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30000),
            new Employee("Bob", 25000),
            new Employee("Charlie", 40000)
        );

        double bonusPercent = 10;

        System.out.println("\nEmployee Salaries with Bonus:");
        employees.forEach(e -> 
            System.out.println(e.name + " -> " + e.getSalaryWithBonus(bonusPercent))
        );

        System.out.println("\nPassword Validation:");
        String[] testPasswords = {
            "Pass123!",     
            "short1!",      
            "nocaps123!",   
            "NOLOWER123!",  
            "NoSpecial123"  
        };

        for (String pwd : testPasswords) {
            System.out.println(pwd + " -> " + validatePassword(pwd));
        }
    }
}
