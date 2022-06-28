package com.zukov.learning.hackerank.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsExplorationTest {

    @Test
    void marsExploration1() {
        assertEquals(0, MarsExploration.marsExploration("SOS"));
    }

    @Test
    void marsExploration4() {
        assertEquals(1, MarsExploration.marsExploration("SOA"));
    }

    @Test
    void marsExploration2() {
        assertEquals(6, MarsExploration.marsExploration("SOSSIDSOSAOSWER"));
    }

    @Test
    void marsExploration3() {
        assertEquals(2, MarsExploration.marsExploration("SSSSSS"));
    }
}