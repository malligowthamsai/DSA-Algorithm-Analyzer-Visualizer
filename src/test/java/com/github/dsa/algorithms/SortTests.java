package com.github.dsa.algorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortTests {

    @Test
    void testBubbleSort() {
        Integer[] input = {5, 1, 4, 2, 8};
        new BubbleSort<Integer>().sort(input);
        assertArrayEquals(new Integer[]{1, 2, 4, 5, 8}, input);
    }

    @Test
    void testMergeSort() {
        Integer[] input = {5, 1, 4, 2, 8};
        new MergeSort<Integer>().sort(input);
        assertArrayEquals(new Integer[]{1, 2, 4, 5, 8}, input);
    }
    
    @Test
    void testStringSorting() {
        String[] input = {"Banana", "Apple", "Cherry"};
        new MergeSort<String>().sort(input);
        assertArrayEquals(new String[]{"Apple", "Banana", "Cherry"}, input);
    }
}
