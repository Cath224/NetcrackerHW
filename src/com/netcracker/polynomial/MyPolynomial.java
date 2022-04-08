package com.netcracker.polynomial;

import java.util.Arrays;


public class MyPolynomial {

    public double[] coeffs;
    public int degree;


    public MyPolynomial(int c, int n) {
        this.degree = n;
        this.coeffs = new double[n + 1];
        this.coeffs[n] = c;

    }

    public MyPolynomial(double ... coeffs) {
        this.coeffs=coeffs;
        this.degree =coeffs.length-1;
    }
    public int getDegree(){
        return degree;
    }
    @Override
    public String toString() {
        String ploynomialString  = new String();
        ploynomialString  = coeffs[degree] + "x^" + degree;

        for (int i = degree-1 ; i >= 0; i--) {
            if (coeffs[i] > 0) {
                ploynomialString += "+" + (coeffs[i]);
            } else if (coeffs[i] < 0) {
                ploynomialString += " - " + (-coeffs[i]);
            }else if (coeffs[i] == 0) {
                continue;
            }
            if (i == 1) {
                ploynomialString += "x";
            } else if (i > 1){
                ploynomialString += "x^" + i;
            }
        }

        if (degree ==  0){
            return Double.toString(coeffs[0]);
        } else if (degree ==  1){
            return coeffs[1] + "x+" + coeffs[0];
        }
        return ploynomialString ;
    }

    public double evaluate(double x){
        double valua = 0;
        double xPower = 0;
        for( int i = degree; i >=0 ; i--){
            xPower = Math.pow(x, i);
            valua = coeffs[i]*xPower  + valua;
        }
        return valua;
    }

    public MyPolynomial add(MyPolynomial polynomial2) {

        int maxDegree =Math.max(this.degree, polynomial2.degree);
        MyPolynomial poynomialAdd = new MyPolynomial(0, maxDegree);

        for (int i = 0; i <= this.degree; i++) {
            poynomialAdd.coeffs[i] += this.coeffs[i];
        }
        for (int i = 0; i <= polynomial2.degree; i++) {
            poynomialAdd.coeffs[i] += polynomial2.coeffs[i];
        }
        return poynomialAdd;
    }


    public MyPolynomial multiply(MyPolynomial polynomial2) {

        int degreeMult =this.degree + polynomial2.degree;
        MyPolynomial poynomialMult = new MyPolynomial(0, degreeMult);

        for (int i = 0; i <= this.degree; i++) {
            for (int j = 0; j <= polynomial2.degree; j++)
                poynomialMult.coeffs[i+j] += (this.coeffs[i] * polynomial2.coeffs[j]);
        }
        return poynomialMult;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyPolynomial that = (MyPolynomial) obj;
        return degree == that.degree && Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + degree;
        result = 31 * result + Arrays.hashCode(coeffs);
        return result;
    }
}
