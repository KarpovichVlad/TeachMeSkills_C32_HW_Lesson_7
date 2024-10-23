package com.techmeskills.lesson_7.task1;

import com.techmeskills.lesson_7.task1.position.Accountant;
import com.techmeskills.lesson_7.task1.position.Director;
import com.techmeskills.lesson_7.task1.position.Worker;

import java.util.Scanner;

/**
 * Задача 1:
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */

public class Runner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position code (1 - Director, 2 - Worker, 3 - Accountant):");
        int code = scanner.nextInt();

        if (code == 1) {
            Director director = new Director();
            director.printPosition();
        } else if (code == 2) {
            Worker worker = new Worker();
            worker.printPosition();
        } else if (code == 3) {
            Accountant accountant = new Accountant();
            accountant.printPosition();
        } else {
            System.out.println("Incorrect position code!");
        }
    }
}