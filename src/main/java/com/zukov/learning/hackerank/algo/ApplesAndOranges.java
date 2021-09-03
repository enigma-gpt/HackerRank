package com.zukov.learning.hackerank.algo;

import java.util.List;
import java.util.function.Predicate;

public class ApplesAndOranges {


    /**
     *         // left boundary of house = s
     *         // right boundary of house = t
     *         // apple tree location on x axis (single point) = a
     *         // orange tree location on x axis (single point) = b
     *         // apples = x axis coordinates - how far it lands from the tree
     *         // oranges = x axis coordinates - how far it lands from the tree
     *
     *
     *          AppleTree                                                                OrangeTree
     *              |                                                                       |
     *
     *
     *                                       house
     *                                  s-----------------------t
     *
     *                                 s<=apple&&orange<=t   && apple&orange = a + apples[n]
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        final long appleCount = apples.stream().filter(fruitFilter(a, s ,t)).count();
        final long orangeCount = oranges.stream().filter(fruitFilter(b, s ,t)).count();

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    private static Predicate<Integer> fruitFilter(int treeXCoordinate, int houseLeftBound, int houseRightBound) {
        return x -> houseLeftBound <= (treeXCoordinate + x) && (treeXCoordinate + x) <= houseRightBound;
    }
}