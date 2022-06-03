package com.zukov.learning.hackerank.algo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseArray {

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here

        return reverseExtended(a);
    }

    private static List<Integer> reverseEasy(List<Integer> a) {

        List<Integer> outList = new LinkedList<>();

        for (int i = a.size() - 1; i >= 0; i--) {
            Integer num = a.get(i);
            outList.add(num);
        }
        return outList;
    }

    private static List<Integer> reverseExtended(List<Integer> a) {

        if (a.size() < 2) {
            return a;
        }

        int backIndex = a.size() - 1;
        int halfSize = (a.size() - 1)/2;

        for(int frontIndex = 0; frontIndex <= halfSize; frontIndex++) {

            Integer frontNumber = a.get(frontIndex);
            Integer backNumber = a.get(backIndex);

            a.set(frontIndex, backNumber);
            a.set(backIndex, frontNumber);

            backIndex--;
        }

        return a;
    }
}
