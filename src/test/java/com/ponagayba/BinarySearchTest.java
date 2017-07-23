package com.ponagayba;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private int[] normalArray = {1, 4, 6, 8, 10, 12, 18};
    private int[] brokenArray = {5, 6, 9, 10, 15, 1, 3, 4};

    @Test
    public void shouldReturnOne() throws Exception {
        assertEquals(1, BinarySearch.search(normalArray, 4));
    }

    @Test
    public void shouldReturnFour() throws Exception {
        assertEquals(4, BinarySearch.search(brokenArray, 15));
    }
}