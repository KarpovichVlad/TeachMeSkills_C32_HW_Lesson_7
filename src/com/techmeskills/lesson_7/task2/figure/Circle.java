package com.techmeskills.lesson_7.task2.figure;

import com.techmeskills.lesson_7.task2.abstractfigure.Figure;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return  Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
