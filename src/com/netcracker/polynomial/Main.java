package com.netcracker.polynomial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        MyPolynomial polynomial = new MyPolynomial(3,3,0,0,6,2);
        System.out.println(polynomial);

        MyPolynomial polynomial2 = new MyPolynomial(5,0,1,244);
        System.out.println(polynomial2);

       System.out.println("Add : " + polynomial.add(polynomial2));
       System.out.println("Mult : " +polynomial.multiply(polynomial2));


        System.out.println("Please,enter x : ");
        Scanner scanner = new Scanner(System.in);
        double x =scanner.nextDouble();

        System.out.println("Polynomial : "  + polynomial +
                "\nx = " + x +
                "\nEvaluate :" + polynomial.evaluate(x));


    }
}
