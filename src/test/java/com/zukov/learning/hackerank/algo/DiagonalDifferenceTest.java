package com.zukov.learning.hackerank.algo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class DiagonalDifferenceTest {

    @Test
    void diagonalDifferenceOfSingleDimensionMatrix() {

        final List<List<Integer>> inputMatrix = List.of(List.of(13));

        final int output = DiagonalDifference.diagonalDifference(inputMatrix);

        then(output).isEqualTo(0);
    }

    @Test
    void diagonalDifferenceOf4DigitDimensionMatrix() {

        final List<List<Integer>> inputMatrix = List.of(List.of(1, 2, 3, 3), List.of(5, 1, 3, 8), List.of(9, 3, 1, 12), List.of(3, 14, 15, 1));

        final int output = DiagonalDifference.diagonalDifference(inputMatrix);

        then(output).isEqualTo(8);
    }

    @Test
    void diagonalDifferenceOf4DigitDimensionMatrixEqualsToZeroTest() {

        final List<List<Integer>> inputMatrix = List.of(List.of(1, 2, 3, 4), List.of(5, 6, 7, 8), List.of(9, 10, 11, 12), List.of(13, 14, 15, 16));

        final int output = DiagonalDifference.diagonalDifference(inputMatrix);

        then(output).isEqualTo(0);
    }
}