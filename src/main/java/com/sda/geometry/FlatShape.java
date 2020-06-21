package com.sda.geometry;

public abstract class FlatShape {
    double width;
    double height;

    public FlatShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void printDimensions (double width, double height){
        System.out.println(String.format("FlatShape [x, y] = [%f, %f]", width, height));
    }
    abstract double getArea(double x, double y);
}
