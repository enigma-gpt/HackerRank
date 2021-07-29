package com.zukov.learning.hackerank.algo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class CompareTheTripletsTest {

    @Test
    void bothScoresEqualsToZero() {
        List<Integer> integers = CompareTheTriplets.compareTriplets(List.of(0, 0, 0), List.of(0, 0, 0));

        then(integers)
                .isNotEmpty()
                .hasSize(2);

        then(integers.get(0))
                .isEqualTo(0);

        then(integers.get(1))
                .isEqualTo(0);
    }

    @Test
    void aliceRankedHigher() {
        List<Integer> integers = CompareTheTriplets.compareTriplets(List.of(1, 0, 1), List.of(0, 1, 0));

        then(integers)
                .isNotEmpty()
                .hasSize(2);

        then(integers.get(0))
                .isEqualTo(2);

        then(integers.get(1))
                .isEqualTo(1);
    }

    @Test
    void bobRankedHigher() {
        List<Integer> integers = CompareTheTriplets.compareTriplets(List.of(0, 1, 0), List.of(1, 0, 1));

        then(integers)
                .isNotEmpty()
                .hasSize(2);

        then(integers.get(0))
                .isEqualTo(1);

        then(integers.get(1))
                .isEqualTo(2);
    }

    @Test
    void bothRankedTheHighest() {
        List<Integer> integers = CompareTheTriplets.compareTriplets(List.of(100, 100, 100), List.of(100, 100, 100));

        then(integers)
                .isNotEmpty()
                .hasSize(2);

        then(integers.get(0))
                .isEqualTo(0);

        then(integers.get(1))
                .isEqualTo(0);
    }
}