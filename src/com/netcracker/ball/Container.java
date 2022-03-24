package com.netcracker.ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = x1 + width ;
        this.y2 = y2 + height ;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2;
    }

    public int getHeight() {
        return y2;
    }

    public boolean collidesWidth(Ball ball) {
        float xBall = ball.getX()+ball.getRadius();
        float yBall = ball.getX()+ball.getRadius();
        if (xBall > x1 && xBall < x2 && yBall < y1 && yBall > y2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Container[ (" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ") ]";
    }
}
