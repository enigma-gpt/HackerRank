package com.zukov.learning.hackerank.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        if (queries.size() < 1 || strings.size() < 1) {
            return List.of();
        }

        Map<String, Integer> stringsMap = new HashMap<>();
        strings.forEach(string -> stringsMap.compute(string, (k , ov) -> ov == null ? 1 : ++ov));

        List<Integer> result = new ArrayList<>(queries.size());

        for (final String queryString : queries) {
            final var queryStringCount = stringsMap.get(queryString);

            if (queryStringCount == null) {
                result.add(0);
                continue;
            }
            result.add(queryStringCount);
        }
        return result;

    }

}
