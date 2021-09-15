package com.zukov.learning.hackerank.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashTablesRansomNotesTest {


    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void checkMagazine() {

        List<String> magazine = List.of("give", "me", "one", "grand", "today", "night");
        List<String> note = List.of("give", "one", "grand", "today");

        HashTablesRansomNotes.checkMagazine(magazine, note);

        assertEquals("Yes", outputStreamCaptor.toString().trim());
    }

    @Test
    void checkMagazine2() {

        List<String> magazine = List.of("two", "times", "three", "is", "not", "four");
        List<String> note = List.of("two", "times", "two", "is", "four");

        HashTablesRansomNotes.checkMagazine(magazine, note);

        assertEquals("No", outputStreamCaptor.toString().trim());
    }

    @Test
    void checkMagazine3() {

        List<String> magazine = List.of("ive", "got", "a", "lovely", "bunch", "of", "coconuts");
        List<String> note = List.of("ive", "got", "some", "coconuts");

        HashTablesRansomNotes.checkMagazine(magazine, note);

        assertEquals("No", outputStreamCaptor.toString().trim());
    }

    @Test
    void checkMagazine4() {

        List<String> magazine = List.of("ive", "got", "a", "lovely", "bunch", "of", "of", "coconuts");
        List<String> note = List.of("ive", "got", "of", "of");

        HashTablesRansomNotes.checkMagazine(magazine, note);

        assertEquals("Yes", outputStreamCaptor.toString().trim());
    }
}