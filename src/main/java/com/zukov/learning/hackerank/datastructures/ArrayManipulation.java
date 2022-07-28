package com.zukov.learning.hackerank.datastructures;

import java.util.LinkedList;
import java.util.List;

public class ArrayManipulation {


    //Naive Implementation
    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        List<Long> tempList = new LinkedList<>();
        for (int i = 0; i  < n; i++) {
            tempList.add(0L);
        }

        queries.forEach(subList -> {
            Integer a = subList.get(0);
            Integer b = subList.get(1);
            Integer k = subList.get(2);

            for (int i=a-1; i <= b-1; i++) {
                tempList.set(i, tempList.get(i) + k);
            }
        });

        return tempList.stream().max(Long::compare).get();
    }
}