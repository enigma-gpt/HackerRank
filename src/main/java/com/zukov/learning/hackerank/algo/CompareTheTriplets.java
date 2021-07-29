package com.zukov.learning.hackerank.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class CompareTheTriplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here

        List<Integer> totalScore = new ArrayList<>();
        totalScore.add(0);
        totalScore.add(0);

        Stream.of(0,1,2).forEach(index -> {
            int aliceScore = a.get(index);
            int bobsScore = b.get(index);

            if (aliceScore != bobsScore) {
                if (aliceScore > bobsScore) {
                    totalScore.set(0, totalScore.get(0) + 1);
                } else {
                    totalScore.set(1, totalScore.get(1) + 1);
                }
            }
        });
        return totalScore;
    }

    public static void main(String[] args) {
        System.out.println(compareTriplets(List.of(10,20,30), List.of(20,30,40)));
    }
}