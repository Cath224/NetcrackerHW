package com.netcracker.complex;

public class Main {
    public static void main(String[] args) {

        Double real = new Double(4.4);
        Double imag = new Double(4.4);

        MyComplex number = new MyComplex(2,1);

        MyComplex right = new MyComplex(3,3);

        System.out.println(right.addNew(number));
        System.out.println(right.suntractNew(number));

        System.out.println(right.magnitude());
        System.out.println(right.argument());

        System.out.println(right.add(right));
        System.out.println(right.suntract(right));
        System.out.println(right.multiply(right));

        System.out.println(right.divide(right));

        System.out.println(number.conjugate());

    }
}
