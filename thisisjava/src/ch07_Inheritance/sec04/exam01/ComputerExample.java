package ch07_Inheritance.sec04.exam01;

import ch06_Class.sec13.exam01.package2.C;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적:" + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적:" + computer.areaCircle(r));

    }
}
