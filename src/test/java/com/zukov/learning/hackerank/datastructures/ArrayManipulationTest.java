package com.zukov.learning.hackerank.datastructures;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class ArrayManipulationTest {

    @Test
    public void test1() {
        int n = 10;

        List<List<Integer>> input = List.of(
                List.of(1, 5, 3),
                List.of(4, 8, 7),
                List.of(6, 9, 1)
        );

        final var l = ArrayManipulation.arrayManipulation(n, input);

        then(l).isEqualTo(10L);
    }

    @Test
    public void test2() {
        int n = 10;

        List<List<Integer>> input = List.of(
                List.of(2, 6, 8),
                List.of(3, 5, 7),
                List.of(1, 8, 1),
                List.of(5, 9, 15)
        );

        final var l = ArrayManipulation.arrayManipulation(n, input);

        then(l).isEqualTo(24L);
    }
}