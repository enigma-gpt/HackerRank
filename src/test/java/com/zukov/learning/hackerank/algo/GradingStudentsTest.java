package com.zukov.learning.hackerank.algo;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradingStudentsTest {


    @Test
    public void lowerBounds37GradeTest() {

        List<Integer> inputGrades = Lists.list(37);

        final var ret = GradingStudents.gradingStudents(inputGrades);

        assertThat(ret).hasSize(1);
        assertThat(ret.get(0)).isEqualTo(37);
    }

    @Test
    public void lowerBounds38GradeTest() {

        List<Integer> inputGrades = Lists.list(38);

        final var ret = GradingStudents.gradingStudents(inputGrades);

        assertThat(ret).hasSize(1);
        assertThat(ret.get(0)).isEqualTo(40);
    }

    @Test
    public void lowerBounds39GradeTest() {

        List<Integer> inputGrades = Lists.list(39);

        final var ret = GradingStudents.gradingStudents(inputGrades);

        assertThat(ret).hasSize(1);
        assertThat(ret.get(0)).isEqualTo(40);
    }

    @Test
    public void lowerBounds40GradeTest() {

        List<Integer> inputGrades = Lists.list(40);

        final var ret = GradingStudents.gradingStudents(inputGrades);

        assertThat(ret).hasSize(1);
        assertThat(ret.get(0)).isEqualTo(40);
    }

    @Test
    public void lowerBounds41GradeTest() {

        List<Integer> inputGrades = Lists.list(41);

        final var ret = GradingStudents.gradingStudents(inputGrades);

        assertThat(ret).hasSize(1);
        assertThat(ret.get(0)).isEqualTo(41);
    }

    @Test
    public void fullListTest() {

        List<Integer> inputGrades = Lists.list(1,19,37,38,39,40,41,52,63,74,85);

        final var ret = GradingStudents.gradingStudents(inputGrades);

        assertThat(ret).containsExactly(1,19,37,40,40,40,41,52,65,75,85);
    }
}