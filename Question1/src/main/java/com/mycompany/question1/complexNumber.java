/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class complexNumber {
    private double re;
    private double im;
    
    
    public complexNumber()
    {
    }
    public complexNumber(double re, double im)
    {
        this.re = re;
        this.im = im;
    }
    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    public void InputComplexNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Real part: ");
        re = sc.nextDouble();
        System.out.print("Imaginary part: ");
        im = sc.nextDouble();
    }
    public void OutputComplexNumber()
    {
        System.out.println("Complex Number: "+re+" + "+im+" i");
    }  
}
