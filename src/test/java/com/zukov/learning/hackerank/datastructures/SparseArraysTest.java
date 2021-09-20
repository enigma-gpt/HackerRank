package com.zukov.learning.hackerank.datastructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

class SparseArraysTest {

    @Test
    void matchingStrings1() {
        List<String> strings = List.of("def", "de","fgh");
        List<String> queries = List.of("de", "lmn", "fgh");

        final var results = SparseArrays.matchingStrings(strings, queries);

        then(results).containsExactly(1,0,1);
    }

    @Test
    void matchingStrings2() {
        List<String> strings = List.of("aba", "baba","aba","xzxb");
        List<String> queries = List.of("aba", "xzxb", "ab");

        final var results = SparseArrays.matchingStrings(strings, queries);

        then(results).containsExactly(2,1,0);
    }

    @Test
    void matchingStrings3() {
        List<String> strings = List.of("abcde", "sdaklfj","asdjf","na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf" );
        List<String> queries = List.of("abcde", "sdaklfj", "asdjf", "na", "basdn");

        final var results = SparseArrays.matchingStrings(strings, queries);

        then(results).containsExactly(1, 3, 4, 3, 2);
    }
}