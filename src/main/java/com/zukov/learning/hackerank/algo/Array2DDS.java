package com.zukov.learning.hackerank.algo;

import java.util.List;

public class Array2DDS {

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        int largestSum =Integer.MIN_VALUE;

        for(int i=0; i < 4; i++) {
            for (int j=0; j < 4; j++) {
                int val1 = arr.get(0 + i).get(0 + j);
                int val2 = arr.get(0 + i).get(1 + j);
                int val3 = arr.get(0 + i).get(2 + j);
                int val4 = arr.get(1 + i).get(1 + j);
                int val5 = arr.get(2 + i).get(0 + j);
                int val6 = arr.get(2 + i).get(1 + j);
                int val7 = arr.get(2 + i).get(2 + j);

                int sum = val1 + val2 + val3 + val4 + val5 + val6 + val7;

                if (largestSum < sum) {
                    largestSum = sum;
                }
            }
        }
        return largestSum;
    }
}

class HourglassCoordinate {

    private int hourGlassCoordinateX;
    private int hourGlassCoordinateY;

    HourglassCoordinate(int hourGlassCoordinateX, int hourGlassCoordinatesY) {
        this.hourGlassCoordinateX = hourGlassCoordinateX;
        this.hourGlassCoordinateY = hourGlassCoordinatesY;
    }

    public int getHourGlassCoordinateX() {
        return hourGlassCoordinateX;
    }

    public int getHourGlassCoordinateY() {
        return hourGlassCoordinateY;
    }
}