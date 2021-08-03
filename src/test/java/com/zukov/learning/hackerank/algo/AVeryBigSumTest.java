package com.zukov.learning.hackerank.algo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;


@ExtendWith(MockitoExtension.class)
class AVeryBigSumTest {

    @Test
    void aVeryBigSum_oneElementWithMaxIntegerSizeTest() {
        List<Long> input = Lists.list(2_147_483_647L);

        long output = AVeryBigSum.aVeryBigSum(input);

        then(output).isEqualTo(2_147_483_647L);
    }

    @Test
    void aVeryBigSum_oneElementWithMinIntegerSizeTest() {
        List<Long> input = Lists.list(-2_147_483_648L);

        long output = AVeryBigSum.aVeryBigSum(input);

        then(output).isEqualTo(-2_147_483_648L);
    }

    @Test
    void aVeryBigSum_tenElementsWithMaxSize() {
        List<Long> input = Lists.list(10_000_000_000L, 10_000_000_000L, 10_000_000_000L, 10_000_000_000L, 10_000_000_000L,
                10_000_000_000L, 10_000_000_000L, 10_000_000_000L, 10_000_000_000L, 10_000_000_000L);

        long output = AVeryBigSum.aVeryBigSum(input);

        then(output).isEqualTo(100_000_000_000L);
    }


    @Test
    void aVeryBigSum_tenElementsWithMinSize() {
        List<Long> input = Lists.list(
                -10_000_000_000L, -10_000_000_000L, -10_000_000_000L, -10_000_000_000L, -10_000_000_000L,
                -10_000_000_000L, -10_000_000_000L, -10_000_000_000L, -10_000_000_000L, -10_000_000_000L);

        long output = AVeryBigSum.aVeryBigSum(input);

        then(output).isEqualTo(-100_000_000_000L);
    }


}