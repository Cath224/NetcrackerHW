package com.netcracker.rectangle;


public class Rectangle {
    private float length ;
    private float width;

    public Rectangle(float length,float width) {
        this.length = length;
        this.width =width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }


    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Float.compare(rectangle.length, length) == 0 && Float.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Float.floatToIntBits(length);
        result = 31 * result + Float.floatToIntBits(width);

        return result;
    }
}
