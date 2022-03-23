package com.netcracker.myPoint;

import com.netcracker.triangle.MyTriangle;


public class Main {
    public static void main(String[] args) {






        MyPoint point = new MyPoint(5,4);

        System.out.println(point.distance(5, 5));
        MyPoint anotherPoint = new MyPoint(9,2);

        System.out.println(point);

        System.out.println(anotherPoint);

        System.out.println(point.distance(anotherPoint));

        System.out.println(point.distance());


    }
}
