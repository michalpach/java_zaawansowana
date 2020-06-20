package com.sda.geometry;

public class FlatShape {
    double width;
    double height;

    public FlatShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void printDimensions {
        System.out.println(String.format("FlatShape [x, y] = [%f, %f]", width, height));
    }
}
