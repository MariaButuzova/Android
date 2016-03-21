package com.example.mashka.helloworld.mashka;


abstract class Figure {

    public int width;
    public int height;

    public Figure(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    abstract double getArea();
    abstract double getPerimeter();
}
