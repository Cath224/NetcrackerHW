package com.netcracker.ball;

import java.util.Arrays;
import java.util.Objects;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed , int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)(speed * Math.cos(direction));
        this.yDelta = (float)(-(speed * Math.cos(direction)));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    //перемещение меча на заданный шаг
    public void move(){
        x+=xDelta;
        y+=yDelta;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
    }
    public void reflectHorizontal(){
        xDelta = -xDelta ;
    }

    public void reflectVertical(){
        yDelta = -yDelta ;
    }

    @Override
    public String toString() {
        return "Ball{(" + x + "," + y + ")" + "speed = (" + xDelta+ "," + yDelta + ") ]";

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Ball)) return false;
        Ball ball = (Ball) obj;
        return Float.compare(ball.x, x) == 0 && Float.compare(ball.y, y) == 0 &&
                radius == ball.radius && Float.compare(ball.xDelta, xDelta) == 0 &&
                Float.compare(ball.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + radius;
        result = 31 * result + Float.floatToIntBits(x);
        result = 31 * result + Float.floatToIntBits(y);
        result = 31 * result + Float.floatToIntBits(xDelta);
        result = 31 * result + Float.floatToIntBits(yDelta);
        return result;
    }
}
