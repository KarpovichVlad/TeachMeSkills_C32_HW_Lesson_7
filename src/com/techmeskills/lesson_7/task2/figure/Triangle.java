package com.techmeskills.lesson_7.task2.figure;

import com.techmeskills.lesson_7.task2.abstractfigure.Figure;

public class Triangle extends Figure {
    private double a, b, c;
    public Triangle(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;


    }

}
