package com.zukov.learning.hackerank.algo;

public class CamelCase {

    public static int camelcase(String s) {
        // Write your code here
        Long count = s.chars()
                .filter(Character::isUpperCase)
                .count();
        return count.intValue() + 1;
    }
}
