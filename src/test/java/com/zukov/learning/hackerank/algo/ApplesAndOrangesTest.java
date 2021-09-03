package com.zukov.learning.hackerank.algo;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplesAndOrangesTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void countApplesAndOrangesTest() {
        ApplesAndOranges.countApplesAndOranges(10, 20, 3, 17, List.of(11, 15, 1), List.of(-2, -12));

        Assert.assertEquals("2\r\n" + "1", outputStreamCaptor.toString().trim());
    }

    @Test
    void countApplesAndOrangesEdgeCasesTest() {
        ApplesAndOranges.countApplesAndOranges(10, 20, 3, 17, List.of(6, 7, 8), List.of(2, 3, 4));

        Assert.assertEquals("2\r\n" + "2", outputStreamCaptor.toString().trim());
    }
}