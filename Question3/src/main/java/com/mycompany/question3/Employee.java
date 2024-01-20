/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Employee {
     private String employeeCode;
    private String employeeName;
    private int yearService;
    private double salaryCoefficient;
    private double basicSalary;
    private double salary;

    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getYearService() {
        return yearService;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public Employee(String code, String name, int years, double coefficient, double basicSalary) {
        this.employeeCode = code;
        this.employeeName = name;
        this.yearService = years;
        this.salaryCoefficient = coefficient;
        this.basicSalary = basicSalary;
    }

    public void InputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Code: ");
        employeeCode = sc.nextLine();
        System.out.print("Employee Name: ");
        employeeName = sc.nextLine();
        System.out.print("Employee Years Of Service: ");
        yearService = sc.nextInt();
        System.out.print("Employee Salary Coefficient: ");
        salaryCoefficient = sc.nextDouble();
        System.out.print("Employee Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    public void SalaryCalculation() {
        salary = salaryCoefficient * basicSalary;
        System.out.println("Employee: "+employeeCode + "-" + employeeName + "-" + salary);

    }

    public void PrintEmployee() {
        System.out.println("Employee code: " + employeeCode + " - Employee name:" + employeeName + " - Years of service: " + yearService + " - Coefficient salary : " + salaryCoefficient + " - Basic salary: " + basicSalary);
    }


    
}
