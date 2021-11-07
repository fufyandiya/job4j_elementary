package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return Math.max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int first = 5;
        int second = 2;
        System.out.println(max(first, second));
    }
}
