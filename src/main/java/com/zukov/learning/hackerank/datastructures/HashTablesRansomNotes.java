package com.zukov.learning.hackerank.datastructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTablesRansomNotes {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Map<String, Integer> magazineHash = new HashMap<>();
        magazine.forEach(m -> magazineHash.compute(m, (k, ov) -> ov == null ? 1 : ++ov));

        final var ret = note.stream()
                .anyMatch(n -> {
                    if(!magazineHash.containsKey(n))
                        return true;

                    var v = magazineHash.remove(n);
                    if(v < 2) {
                        magazineHash.remove(n);
                    } else {
                        magazineHash.put(n, --v);
                    }
                    return false;
                });

        if(!ret) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}