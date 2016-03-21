package com.example.mashka.helloworld.mashka;


public class Circle extends Figure {
    private int radius;

    public Circle(int width) {
        super(width, width);
        this.radius = width / 2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    double getPerimeter() {
        return (2 * Math.PI * radius);
    }
}
