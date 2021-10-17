package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {
    @Test
    public void whenMondayRu() {
        String in = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMondayEn() {
        String in = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayRu() {
        String in = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayEn() {
        String in = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesdayRu() {
        String in = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesdayEn() {
        String in = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursdayRu() {
        String in = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursdayEn() {
        String in = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFridayRu() {
        String in = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFridayEn() {
        String in = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturdayRu() {
        String in = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturdayEn() {
        String in = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayRu() {
        String in = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayEn() {
        String in = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenError() {
        String in = "aWDqwdaqsd";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}