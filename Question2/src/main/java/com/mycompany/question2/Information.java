/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Information {
    private int accNum;
    private String accname;
    private double balance;

    public int getAccNum() {
        return accNum;
    }

    public String getAccname() {
        return accname;
    }

    public double getBalance() {
        return balance;
    }

    public Information() {
    }

    public Information(int accNum, String accname, int balance) {
        this.accNum = accNum;
        this.accname = accname;
        this.balance = balance;
    }

    public void InputInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bank account number: ");
        accNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Bank account name: ");
        accname = sc.nextLine();
        System.out.print("Bank account balance: ");
        balance = sc.nextDouble();
    }

    public void OutputInformation() {
        System.out.println("Bank account number: " + accNum + " - Bank account name: " + accname + " - Bank account balance: " + balance);
    }

    public void Deposit(double money) {
        balance += money;
        System.out.print("Deposit successfull - Your balance: " + balance);
        System.out.println();
    }

    public void Withdraw(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.print("Withdraw successfull - Your balance: " + balance);
            System.out.println();
        } else {
            System.out.print("Your balance does not have enough money");
            System.out.println();
        }
    }

    public void Transfer(double money, Information another) {
        if (balance >= money) {
            balance -= money;
            another.balance += money;
            System.out.print("Transfer successfull - Your balance: " + balance);
            System.out.println();
        } else {
            System.out.println("Your balance does not have enough money");
            System.out.println();
        }
    }
}
