package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {

        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtrAndDivide(double first, double second) {

        return subtraction(first, second)
                + divide(first, second);
    }

    public static double allOperations(double first, double second) {

        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {

        System.out.println("Результат первого метода равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат второго метода равен: " + subtrAndDivide(10, 20));
        System.out.println("Результат третьего метода равен: " + allOperations(10, 20));
    }
}
