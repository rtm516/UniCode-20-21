package com.rtm516.showcode.alarics_treasure;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static Map<Character, Integer> values = new HashMap<Character, Integer>() {{
        put('M', 1000);
        put('D', 500);
        put('C', 100);
        put('L', 50);
        put('X', 10);
        put('V', 5);
        put('I', 1);
    }};

    public static int parseRomanNumerals(String input) {
        int total = 0;
        int last = 0;

        for (char letter : input.toCharArray()) {
            Integer val = values.get(letter);
            if (val == null) {
                continue;
            }
            total += val;

            if (last < val) {
                total -= last * 2;
            }

            last = val;
        }


        return total;
    }
}