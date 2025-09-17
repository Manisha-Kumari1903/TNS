package com.Manisha.assignment.utilities;


import com.Manisha.assignment.Employee.*;

/**
 * Utility class for Employee operations
 */
public class EmployeeUtilities {

    // Print Employee details
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());

        if (emp instanceof Manager) {
            Manager m = (Manager) emp;
            System.out.println("Department: " + m.getDepartment());
        } else if (emp instanceof Developer) {
            Developer d = (Developer) emp;
            System.out.println("Programming Language: " + d.getProgrammingLanguage());
        }
        System.out.println("-----------------------------");
    }

    // Calculate Bonus (10% of salary for simplicity)
    public static double calculateBonus(Employee emp) {
        return emp.getSalary() * 0.10;
    }
}

