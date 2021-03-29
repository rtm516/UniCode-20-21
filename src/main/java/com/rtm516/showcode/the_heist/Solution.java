package com.rtm516.showcode.the_heist;

import java.util.Arrays;

public class Solution {
    // This is not super efficient but should cover almost every edge case
    public static int calculateCapacity(int[] input) {
        int height = Arrays.stream(input).max().getAsInt();

        // Create the array filled with ~
        char[][] chars = new char[input.length][height];
        for (char[] c : chars) {
            Arrays.fill(c, '~');
        }

        // Fill the needed parts with #
        for (int x = 0; x < input.length; x++) {
            int value = input[x];

            for (int y = 0; y < value; y++) {
                chars[x][y] = '#';
            }
        }

        // Loop over the rows
        int fillCount = 0;
        for (int y = 0; y < height; y++) {
            // Build the row string
            StringBuilder row = new StringBuilder();
            for (int x = 0; x < input.length; x++) {
                row.append(chars[x][y]);
            }

            // Remove leading or trailing ~
            String finalRow = row.toString().replaceAll("^~+|~+$", "");

            // Count the remaining ~
            for (char c : finalRow.toCharArray()) {
                if (c == '~') {
                    fillCount++;
                }
            }
        }

        return fillCount;
    }
}