package com.zukov.learning.hackerank.datastructures;

import java.util.LinkedList;
import java.util.List;

public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here

        List<Integer> tempList = new LinkedList<>();
        for (int i = 0; i  < n; i++) {
            tempList.add(0);
        }

        queries.forEach(subList -> {
            Integer a = subList.get(0);
            Integer b = subList.get(1);
            Integer k = subList.get(2);

            for (int i=a; i < b; i++) {
                tempList.
            }



        });





    }

}
