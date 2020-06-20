package com.sda.geometry;

public class Rectangle extends  FlatShape {
    Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    double getArea(double x, double y){
        return x*y;
    }
}
