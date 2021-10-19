package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromZeroToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToTwoThenTwo() {
        int start = 2;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}