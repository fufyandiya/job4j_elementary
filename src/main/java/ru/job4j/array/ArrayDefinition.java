package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivan";
        names[1] = "Nikolay";
        names[2] = "Petr";
        names[3] = "Vasily";
        System.out.println("Первая ячейка - " + names[0]);
        System.out.println("Вторая ячейка - " + names[1]);
        System.out.println("Третья ячейка - " + names[2]);
        System.out.println("Четвертая ячейка - " + names[3]);
    }
}
