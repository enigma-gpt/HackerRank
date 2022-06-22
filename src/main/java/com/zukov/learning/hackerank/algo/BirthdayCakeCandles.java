package com.zukov.learning.hackerank.algo;

import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        if (candles.size() == 1) {
            return 1;
        }

        candles.sort(Comparator.reverseOrder());

        int tallestCandle = candles.get(0);
        int numberOfTallestCandles = 0;
        for (int candleHeight : candles) {
            if (candleHeight != tallestCandle) {
                break;
            }
            numberOfTallestCandles++;
        }
        return numberOfTallestCandles;
    }
}
