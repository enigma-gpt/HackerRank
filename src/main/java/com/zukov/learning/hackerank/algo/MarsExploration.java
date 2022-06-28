package com.zukov.learning.hackerank.algo;

public class MarsExploration {

    public static int marsExploration(String s) {
        // Write your code here
        int ret = 0;
        int i = 0;
        for (char c : s.toCharArray()) {
            int letterIndex = i % 3;

            if (letterIndex == 0 && c != 'S' ||
                    letterIndex == 1 && c != 'O' ||
                    letterIndex == 2 && c != 'S') {
                ret++;
            }
            i++;
        }
        return ret;
    }
}
