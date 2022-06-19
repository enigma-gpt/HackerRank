package com.zukov.learning.hackerank.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class LeftRotationTest {

    @Test
    void rotateLeft() {
        List<Integer> input = List.of(1,2,3,4,5);
        int rotation = 2;

        List<Integer> ret = LeftRotation.rotateLeft(rotation, input);

        then(ret.get(0)).isEqualTo(3);
        then(ret.get(1)).isEqualTo(4);
        then(ret.get(2)).isEqualTo(5);
        then(ret.get(3)).isEqualTo(1);
        then(ret.get(4)).isEqualTo(2);
    }

    @Test
    void rotateLeft4() {
        List<Integer> input = List.of(1,2,3,4,5,6);
        int rotation = 3;

        List<Integer> ret = LeftRotation.rotateLeft(rotation, input);

        then(ret.get(0)).isEqualTo(4);
        then(ret.get(1)).isEqualTo(5);
        then(ret.get(2)).isEqualTo(6);
        then(ret.get(3)).isEqualTo(1);
        then(ret.get(4)).isEqualTo(2);
        then(ret.get(5)).isEqualTo(3);
    }

    @Test
    void rotateLeft2() {
        List<Integer> input = List.of(1);
        int rotation = 2;

        List<Integer> ret = LeftRotation.rotateLeft(rotation, input);

        then(ret.get(0)).isEqualTo(1);
    }

    @Test
    void rotateLeft3() {
        List<Integer> input = List.of(1,2);
        int rotation = 10;

        List<Integer> ret = LeftRotation.rotateLeft(rotation, input);

        then(ret.get(0)).isEqualTo(1);
        then(ret.get(1)).isEqualTo(2);
    }
}