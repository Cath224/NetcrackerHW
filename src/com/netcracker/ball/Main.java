package com.netcracker.ball;

public class Main {
    public static void main(String[] args) {

        int degree = 4;
        Ball ball = new Ball(5, 5, 1, 1, 2);
        Container container = new Container(0, 0, -10, -10);
        System.out.println(container);

        int i =0;
        while (i<111) {
            ball.move();
            if (container.collidesWidth(ball)) {
                continue;
            }else if (((ball.getX()+ball.getRadius())+1)<=container.getX()
                     || ((ball.getX()+ball.getRadius())+1)>=container.getWidth()){
                ball.reflectVertical();
                System.out.println("vvvvvvvvvvvvvvvvvv");
            }else if  (((ball.getY()+ball.getRadius())+1)>=container.getY()
                      ||((ball.getX()+ball.getRadius())+1)<=container.getHeight()){
                ball.reflectHorizontal();
                System.out.println("hhhhhhhhhhhhhhhhhhh");
            }
            System.out.println(ball);
            System.out.println(container);
            i++;
        }
    }
}


