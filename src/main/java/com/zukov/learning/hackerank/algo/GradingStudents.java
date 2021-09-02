package com.zukov.learning.hackerank.algo;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GradingStudents {

    /*
        Sam is a professor at the university and likes to round each student's  according to these rules:

        If the difference between the grade and the next multiple of 5 is less than 3, round  up to the next multiple of 5.
        If the value of grade  is less than 38 , no rounding occurs as the result will still be a failing grade.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream()
                .map(GRADE_ROUNDING_MAPPER)
                .collect(Collectors.toList());
    }

    private static final Function<Integer, Integer> GRADE_ROUNDING_MAPPER = grade -> {
        if(grade < 38) {
            return grade;
        }
        int restOfDividingGradeBy5 = grade % 5;
        return restOfDividingGradeBy5 > 2 ? roundUp(grade, restOfDividingGradeBy5) : grade;
    };

    private static int roundUp(Integer grade, int restOfDividingGradeBy5) {
        return (grade - restOfDividingGradeBy5) + 5;
    }
}