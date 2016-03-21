package com.example.mashka.helloworld.mashka;


public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    double getArea() {
        double p = this.getPerimeter();
        return ((Math.sqrt(p * (p - a) * (p - b) * (p - c)))/4);
    }

    @Override
    double getPerimeter() {
        return (a + b + c);
    }
}
