package com.netcracker.triangle;

import com.netcracker.myPoint.MyPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x and y for A");
        int v1x = scanner.nextInt();
        int v1y = scanner.nextInt();
        MyPoint pointV1 = new MyPoint(v1x, v1y);

        System.out.println("enter x and y for B");
        int v2x = scanner.nextInt();
        int v2y = scanner.nextInt();
        MyPoint pointV2 = new MyPoint(v2x, v2y);

        System.out.println("enter x and y for C");
        int v3x = scanner.nextInt();
        int v3y = scanner.nextInt();
        MyPoint pointV3 = new MyPoint(v3x, v3y);


        MyTriangle triangle = new MyTriangle(pointV1,pointV2,pointV3);
        System.out.println(triangle);

        double[] length = triangle.lengthPoint();

        System.out.println("Perimeter = " + triangle.getPerimeter(length));
        System.out.println(triangle.getType(length));



    }
}
