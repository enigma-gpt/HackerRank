package com.zukov.learning.hackerank.algo;

import java.util.List;
import java.util.Optional;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here

        Optional<Integer> ret = ar.stream().reduce(Integer::sum);

        if (ret.isEmpty())
            throw new IllegalStateException("no input was provided for the algo!");
        
        return ret.get();
    }
}