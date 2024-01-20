/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

/**
 *
 * @author LENOVO
 */
public class Question1 {

    public static void main(String[] args) {
        complexNumber number1 = new complexNumber(10,11);
        number1.OutputComplexNumber();
        complexNumber number2 = new complexNumber(7,8);
        number2.OutputComplexNumber();
        System.out.print("Addition - ");
        Addition(number1,number2).OutputComplexNumber();
        System.out.print("Subtraction - ");
        subtraction(number1,number2).OutputComplexNumber();
        System.out.print("Multiplication - ");
        multiplication(number1,number2).OutputComplexNumber();
        System.out.print("Division - ");
        division(number1,number2).OutputComplexNumber();
        
        

    }

    public static complexNumber Addition(complexNumber com1, complexNumber com2) {
        double real = com1.getRe() + com2.getRe();
        double imaginary = com1.getIm() + com2.getIm();
        complexNumber sum = new complexNumber(real, imaginary);
        return sum;
    }

    public static complexNumber subtraction(complexNumber com1, complexNumber com2) {
        double real = com1.getRe() - com2.getRe();
        double imaginary = com1.getIm() - com2.getIm();
        complexNumber minus = new complexNumber(real, imaginary);
        return minus;
    }

    public static complexNumber multiplication(complexNumber com1, complexNumber com2) {
        double real = (com1.getRe() * com2.getRe()) - (com1.getIm() * com2.getIm());
        double imaginary = (com1.getRe() * com2.getIm()) + (com2.getRe() * com1.getIm());
        complexNumber sum = new complexNumber(real, imaginary);
        return sum;

    }

    public static complexNumber division(complexNumber com1, complexNumber com2) {
        double real = ((com1.getRe() * com2.getRe()) + (com1.getIm() * com2.getIm())) / ((com2.getRe() * com2.getRe()) + (com2.getIm() * com2.getIm()));
        double imaginary = ((com1.getIm() * com2.getRe()) - (com1.getRe() * com2.getIm())) / ((com2.getRe() * com2.getRe()) + (com2.getIm() * com2.getIm()));
        complexNumber sum = new complexNumber(real, imaginary);
        return sum;

    }
}
