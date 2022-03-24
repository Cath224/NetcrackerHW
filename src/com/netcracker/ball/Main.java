package com.netcracker.ball;

public class Main {
    public static void main(String[] args) {

        int degree = 4;
        Ball ball = new Ball(5, 5, 1, 1, 2);
        Container container = new Container(0, 0, -10, -10);
        System.out.println(container);

        int i =0;
        while (i<10) {
            ball.move();
            if (container.collidesWidth(ball)) {
                continue;
            }else if (((ball.getX()+ball.getRadius()))<=container.getX()
                     || ((ball.getX()+ball.getRadius()))>=container.getWidth()){
                ball.reflectVertical();
            }else if  (((ball.getY()+ball.getRadius()))>=container.getY()
                      ||((ball.getX()+ball.getRadius()))<=container.getHeight()){
                ball.reflectHorizontal();
            }
            System.out.println(ball);
            System.out.println(container);
            i++;
        }
    }
}


