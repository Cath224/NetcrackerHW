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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0 && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        long bitsReal = Double.doubleToLongBits(radius );
        result = 31 * result + (int)(bitsReal ^ bitsReal >>> 32);
        result = 31 * result + color.hashCode();
        return result;
    }
}
