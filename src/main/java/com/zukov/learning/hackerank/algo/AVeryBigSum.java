package com.zukov.learning.hackerank.algo;

import java.util.List;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {

        return ar.stream().reduce(Long::sum).orElseThrow();

        /*Long sum = 0L;
        System.out.println(ar.size());
        for(int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
            Long element = ar.get(i);
            sum += element;
        }
        return sum;*/
    }
}
