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
        float xRightBall = ball.getX()+ball.getRadius();
        float xLeftBall = ball.getX()-ball.getRadius();
        float yUpBall = ball.getX()+ball.getRadius();
        float yDownBall = ball.getX()-ball.getRadius();
        return  xLeftBall  > x1 &&
                xRightBall < x2 &&
                yUpBall    < y1 &&
                yDownBall  > y2;
    }

    @Override
    public String toString() {
        return "Container[ (" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ") ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Container)) return false;
        Container container = (Container) obj;
        return x1 == container.x1 && y1 == container.y1 && x2 == container.x2 && y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x1;
        result = 31 * result + x2;
        result = 31 * result + y1;
        result = 31 * result + y2;

        return result;
    }
}
