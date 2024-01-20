/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Question2 {
    private ArrayList<Information> NumberOfAccount = new ArrayList<>();
    
    public Question2()
    {
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of account: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            Information account = new Information();
            account.InputInformation();
            NumberOfAccount.add(account);
        }
        
    }
    public void output()
    {
        for(int i=0;i<NumberOfAccount.size();i++){
            NumberOfAccount.get(i).OutputInformation();
        }
        NumberOfAccount.get(0).Deposit(50000);
        NumberOfAccount.get(1).Withdraw(100000);
        NumberOfAccount.get(0).Transfer(10000, NumberOfAccount.get(1));
    }

    public static void main(String[] args) {
        Question2 Account = new Question2();
        Account.input();
        Account.output();
    }
}
