package com.zukov.learning.hackerank.algo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void reverseArray0() {
        List<Integer> input = List.of();
        List<Integer> out = ReverseArray.reverseArray(input);
        Assert.assertEquals(out.size(), input.size());
    }

    @Test
    void reverseArray1() {
        List<Integer> input = List.of(10000);
        List<Integer> out = ReverseArray.reverseArray(input);
        Assert.assertEquals(out.size(), input.size());
        Assert.assertEquals(out.get(0), input.get(0));
    }

    @Test
    void reverseArray5() {
        List<Integer> input = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            input.add(i);
        }
        List<Integer> out = ReverseArray.reverseArray(input);
        Assert.assertEquals(input.size(), out.size());
        Assert.assertEquals(List.of(5,4,3,2,1), out);
    }

    @Test
    void reverseArray4() {
        List<Integer> input = new LinkedList<>();
        for (int i = 1; i <= 4; i++) {
            input.add(i);
        }
        List<Integer> out = ReverseArray.reverseArray(input);
        Assert.assertEquals(input.size(), out.size());
        Assert.assertEquals(List.of(4,3,2,1), out);
    }

    @Test
    void reverseArray1000() {
        List<Integer> input = new LinkedList<>();
        for (int i = 1; i <= 1000; i++) {
            input.add(i);
        }

        List<Integer> out = ReverseArray.reverseArray(input);
        Assert.assertEquals(input.size(), out.size());

        List<Integer> collect = List.of(1000, 999, 998, 997, 996);
        Assert.assertEquals(collect.get(0), out.get(0));
        Assert.assertEquals(collect.get(1), out.get(1));
        Assert.assertEquals(collect.get(2), out.get(2));
        Assert.assertEquals(collect.get(3), out.get(3));
        Assert.assertEquals(collect.get(4), out.get(4));

    }
}