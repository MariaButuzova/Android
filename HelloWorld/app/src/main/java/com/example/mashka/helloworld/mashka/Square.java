package com.example.mashka.helloworld.mashka;

public class Square extends Figure {

    public Square(int width) {
        super(width, width);
    }

    @Override
    double getArea() {
        return (width * width);
    }

    @Override
    double getPerimeter() {
        return (4 * width);
    }
}
