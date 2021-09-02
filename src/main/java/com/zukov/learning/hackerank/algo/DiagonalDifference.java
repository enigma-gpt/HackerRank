package com.zukov.learning.hackerank.algo;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalLeft = 0;
        int diagonalRight = 0;

        for(int i=0; i < arr.size(); i++) {
            List<Integer> row = arr.get(i);
            diagonalLeft += row.get(i);
            diagonalRight += row.get((arr.size() - 1) - i);
        }
        return Math.abs(diagonalLeft - diagonalRight);
    }
}