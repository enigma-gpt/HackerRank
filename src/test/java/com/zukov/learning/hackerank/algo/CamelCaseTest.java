package com.zukov.learning.hackerank.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CamelCaseTest {

    @Test
    void camelcase1() {
        String input = "s";
        int output = CamelCase.camelcase(input);
        assertThat(output).isEqualTo(1);
    }

    @Test
    void camelcase2() {
        String input = "saveChangesInTheEditor";
        int output = CamelCase.camelcase(input);
        assertThat(output).isEqualTo(5);
    }

    @Test
    void camelcase3() {
        String input = "save";
        int output = CamelCase.camelcase(input);
        assertThat(output).isEqualTo(1);
    }
}