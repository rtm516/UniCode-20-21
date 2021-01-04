package com.rtm516.showcode.devvie;

public class Solution {
    public static int devvie(String input) {
        char[] chars = input.toCharArray();

        int x = 0;
        int y = 0;

        int direction = 0;

        // Work out position
        for (char c : chars) {
            switch (c) {
                case 'F':
                    // Change X/Y based on direction
                    if (direction % 2 == 0) {
                        y -= direction - 1;
                    } else {
                        x -= direction - 2;
                    }
                    break;

                case 'L':
                    // Rotate the direction counter-clockwise
                    // and wrap it so its between 0-4
                    direction -= 1;
                    direction = (direction + 4) % 4;
                    break;

                case 'R':
                    // Rotate the direction clockwise
                    // and wrap it so its between 0-4
                    direction += 1;
                    direction = (direction + 4) % 4;
                    break;

                default:
                    break;
            }
        }

        int moves = 0;
        boolean doneX = false;

        // If y is negative
        if (y < 0) {
            switch (direction) {
                case 1:
                    // Check if we are facing the right direction
                    // to move the right way for X
                    if (x < 0) {
                        moves += Math.abs(x);
                        doneX = true;
                    }

                    moves += 1;
                    break;

                case 3:
                    // Check if we are facing the right direction
                    // to move the right way for X
                    if (x > 0) {
                        moves += Math.abs(x);
                        doneX = true;
                    }

                    moves += 1;
                    break;

                case 2:
                    // We are facing down so just add X since we will go
                    // past the right direction when rotating back to the top
                    moves += Math.abs(x);
                    doneX = true;

                    moves += 2;
                    break;

                default:
                    break;
            }
        } else {
            switch (direction) {
                case 1:
                    // Check if we are facing the right direction
                    // to move the right way for X
                    if (x < 0) {
                        moves += Math.abs(x);
                        doneX = true;
                    }

                    moves += 1;
                    break;

                case 3:
                    // Check if we are facing the right direction
                    // to move the right way for X
                    if (x > 0) {
                        moves += Math.abs(x);
                        doneX = true;
                    }

                    moves += 1;
                    break;

                case 0:
                    // We are facing down so just add X since we will go
                    // past the right direction when rotating back to the top
                    moves += Math.abs(x);
                    doneX = true;

                    moves += 2;
                    break;

                default:
                    break;
            }
        }

        // Add the y change to moves
        moves += Math.abs(y);

        // If we havent covered X yet and it has
        // a value, add 1 + X to moves
        if (!doneX && x != 0) {
            moves += 1;
            moves += Math.abs(x);
        }

        return moves;
    }
}