package com.netcracker.complex;



public class MyComplex {
    private double real ;
    private double imag ;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i" + " )";
    }

    public boolean isReal() {
        return real != 0.0;
    }

    public boolean isImaginary() {
        return imag != 0.0;
    }

    public boolean equals(Double real, Double imag) {
        return real.equals(imag);
    }

    public boolean equals(MyComplex number) {
        return equals(number.real, number.imag);
    }

    public double magnitude() {
        return Math.sqrt((real * imag) + (real * imag));
    }

    public double argument() {
        return Math.atan2(imag, real);
    }
    public MyComplex add (MyComplex right){
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
        return this ;

    }
    public MyComplex addNew (MyComplex right){
        double real = this.real + right.real;
        double imag = this.imag + right.imag;
        return new MyComplex (real,imag);

    }
    public MyComplex suntract (MyComplex right){
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return this ;

    }
    public MyComplex suntractNew (MyComplex right){
        double real = this.real - right.real;
        double imag = this.imag - right.imag;
        return new MyComplex (real,imag);

    }
    public MyComplex multiply (MyComplex right){
        this.real = this.real * right.real;
        this.imag = this.imag * right.imag;
        return this ;
    }
    public MyComplex divide (MyComplex right){
        this.real = this.real / right.real;
        this.imag = this.imag / right.imag;
        return this ;

    }

    public MyComplex conjugate (){
        return new MyComplex(this.real , (-1)*this.imag);

    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyComplex)) return false;
        MyComplex myComplex = (MyComplex) obj;
        return Double.compare(myComplex.real, real) == 0 && Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long bitsReal = Double.doubleToLongBits(real);
        result = 31 * result + (int)(bitsReal ^ bitsReal >>> 32);
        long bitsImag = Double.doubleToLongBits(imag);
        result = 31 * result + (int)(bitsImag ^ bitsImag >>> 32);

        return result;

    }
}
