package com.zukov.learning.hackerank.algo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {

    @Test
    void birthdayCakeCandles1() {
        List<Integer> birthdayCandles = new ArrayList<>();
        birthdayCandles.add(1);
        birthdayCandles.add(15);
        birthdayCandles.add(9);
        birthdayCandles.add(6);
        birthdayCandles.add(9);
        birthdayCandles.add(15);
        int i = BirthdayCakeCandles.birthdayCakeCandles(birthdayCandles);
        assertEquals(2, i);
    }

    @Test
    void birthdayCakeCandles2() {
        List<Integer> birthdayCandles = new ArrayList<>();
        birthdayCandles.add(15);
        int i = BirthdayCakeCandles.birthdayCakeCandles(birthdayCandles);
        assertEquals(1, i);
    }
}