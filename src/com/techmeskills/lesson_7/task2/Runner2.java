package com.techmeskills.lesson_7.task2;

import com.techmeskills.lesson_7.task2.abstractfigure.Figure;
import com.techmeskills.lesson_7.task2.figure.Circle;
import com.techmeskills.lesson_7.task2.figure.Rectangle;
import com.techmeskills.lesson_7.task2.figure.Triangle;

/**
 * Задача 2:
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
 * Создать массив из 5 разных фигур.
 * Пройтись циклом по массиву и вывести информацию о каждой фигуре.
 * Вывести на экран сумму периметров всех фигур в массиве.
 */
public class Runner2 {

    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
            figures[0] = new Circle(3);
            figures[1] = new Rectangle(5, 8);
            figures[2] = new Triangle(3, 4, 5);
            figures[3] = new Rectangle(3, 4);
            figures[4] = new Circle(7);

            double totalPerimeter = 0;

            for (Figure figure : figures) {
                figure.printInfo();
                totalPerimeter += figure.getPerimeter();
            }
            System.out.println("Total Perimeter: " + totalPerimeter);

    }
}