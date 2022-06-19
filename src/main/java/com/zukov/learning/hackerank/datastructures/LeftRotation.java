package com.zukov.learning.hackerank.datastructures;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        if(arr.isEmpty() || arr.size() == 1 || d == 0) {
            return arr;
        }

        List<Integer> ret = new ArrayList<>();
        for (int i=0; i < arr.size(); i++) {
            ret.add(0);
        }

        for (int i=0; i < arr.size(); i++) {
            Integer element = arr.get(i);
            int position = (i - d) % arr.size();
            position = position < 0 ? arr.size() + position : position;
            ret.set(position, element);
        }
        return ret;
    }
}
