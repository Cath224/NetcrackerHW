package com.netcracker.triangle;

import com.netcracker.myPoint.MyPoint;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v1.setX(y1);

        v2.setX(x2);
        v2.setX(y2);

        v3.setX(x3);
        v3.setX(y3);
    }


    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {

        return "MyTriangle[" + "v1=" + v1.toString()+",v2=" + v2.toString()+",v3=" + v3.toString()+"]";
    }

    public double getPerimeter(double[] array) {
        return array [0] + array [1] + array [2];
    }


    public double[] lengthPoint() {
        double[] array = new double[3];
        array[0] = v1.distance(v2.getX(), v2.getY());
        array[1] = v2.distance(v3.getX(), v3.getY());
        array[2] = v3.distance(v1.getX(), v1.getY());
        return array;

    }

    public String getType(double[] array){
        if (Double.compare(array [0],array [1])==0 && Double.compare(array [1],array [2])==0)
                return "Equilateral";
            else if (Double.compare(array [0],array [1])==0 ||
                     Double.compare(array [1],array [2])==0 ||
                     Double.compare(array [0],array [2])==0)
                return "Isosceles";
            else
                return "Scalene";
        }
}
