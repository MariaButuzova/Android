package com.example.mashka.helloworld.mashka;


public class Rectangle extends Figure {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    double getArea() {
        return (width * height);
    }

    @Override
    double getPerimeter() {
        return (2 * (width + height));
    }
}
