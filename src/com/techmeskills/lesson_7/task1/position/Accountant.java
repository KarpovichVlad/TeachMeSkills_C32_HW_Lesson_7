package com.techmeskills.lesson_7.task1.position;

import com.techmeskills.lesson_7.task1.interfaceposition.Position;

public class Accountant implements Position {

    @Override
    public void printPosition() {
        System.out.println("Position: Accountant.");
    }
}
