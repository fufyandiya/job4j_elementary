package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortFive() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThree() {
        int[] data = new int[] {22, 156, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 22, 156};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortSix() {
        int[] data = new int[] {22, 156, 1, -5, 0, 253};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-5, 0, 1, 22, 156, 253};
        Assert.assertArrayEquals(expected, result);
    }
}