package com.netcracker.myPoint;


// sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1))
public class MyPoint {

    private int x ;
    private int y ;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int [] array = new int[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }
    public void setXY(int x,int y){
        this.x =x;
        this.y=y;
    }

    public double distance(int x, int y) {
        int x1 = this.x;
        int y1 = this.y;
        int x2= x;
        int y2= y;

        return  formulaDistance(x1, x2 , y1 , y2);
    }

    public double distance(MyPoint anotherPoint){
        int x1= this.x;
        int y1= this.y;

        int x2=anotherPoint.x;
        int y2=anotherPoint.y;

        return formulaDistance(x1, x2 , y1 , y2);
    }

    public double distance() {

        int x1= this.x;
        int y1= this.y;

        int x2=0;
        int y2=0;
        return formulaDistance(x1, x2 , y1 , y2);
    }


    @Override
    public String toString() {
        return "(" + x + "," + y +")";
    }


    public double formulaDistance(int x1,int x2 , int y1 , int y2){
        return Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
    }

}
