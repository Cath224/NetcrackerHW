package com.netcracker.circle;

public class Circle {
    private double radius  ;
    private String color  ;


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color) {

        this(radius);
        this.color = color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radious= " + radius +
                ", color= '" + color + '\'' +
                '}';
    }



}
