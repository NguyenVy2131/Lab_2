/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question3;

import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Question3 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number Of Employee:");
        ArrayList<Employee> list = new ArrayList<>();
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee();
            employee.InputEmployee();
            list.add(employee);
        }
        EmployeeSalary(list);
        
        HighestSalary(list);
        SortSalary(list);
        EmployeeSalary(list);
    }

    public static void EmployeeSalary(ArrayList<Employee> list) {
        System.out.println("Salary Sheet:");
        for (int i=0;i<list.size();i++) {
            list.get(i).SalaryCalculation();
        }
    }

    public static void HighestSalary(ArrayList<Employee> list) {
        System.out.println("Employees with highest salary:");
        double max = 0;
        for (int i=0;i<list.size();i++) {
            if (list.get(i).getSalary() > max) {
                max = list.get(i).getSalary();
            }
        }
        for (int i=0;i<list.size();i++) {
            if (list.get(i).getSalary() == max) {
                list.get(i).SalaryCalculation();
            }
        }
    }

    public static void SortSalary(ArrayList<Employee> list) {
        System.out.println("From highest to lowest salary:");
        Comparator<Employee> compare;
        compare = new Comparator<>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return (int) (emp2.getSalary() - emp1.getSalary());
            }
        };
        list.sort(compare);
    }
}
