package com.techmeskills.lesson_7.task2.figure;

import com.techmeskills.lesson_7.task2.abstractfigure.Figure;

public class Rectangle extends Figure{
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);

    }
}
