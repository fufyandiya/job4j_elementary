package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        String separate = " ";
        System.out.println(idea);
        idea += separate + "But I am a newbie.";
        int year = 2021;
        idea += separate + year;
        System.out.println(idea);
    }
}
