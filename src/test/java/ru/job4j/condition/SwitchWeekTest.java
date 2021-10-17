package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {
    @Test
    public void whenMonday() {
        int in = 1;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Понедельник.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesday() {
        int in = 2;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Вторник.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesday() {
        int in = 3;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Среда.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursday() {
        int in = 4;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Четверг.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFriday() {
        int in = 5;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Пятница.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturday() {
        int in = 6;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Суббота.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSunday() {
        int in = 7;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Воскресенье.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenError() {
        int in = 8;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Ошибка.";
        Assert.assertEquals(expected, result);
    }
}