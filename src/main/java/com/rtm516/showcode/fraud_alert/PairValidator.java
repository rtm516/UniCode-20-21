package com.rtm516.showcode.fraud_alert;

public class PairValidator {
    public static Boolean validate(String input, String input2) {
        if (input.length() != input2.length()) {
            return false;
        }

        input = input.toUpperCase();
        input2 = input2.toUpperCase();

        StringBuilder sb = new StringBuilder();
        sb.append(input2);
        sb.reverse();
        input2 = sb.toString();

        for (int i = 0; i < input.length(); i++) {
            char c1 = input.toCharArray()[i];
            char c2 = input2.toCharArray()[i];

            if (!Character.isLetter(c1) || !Character.isLetter(c2)) {
                return false;
            }

            if (Math.abs((int)c1 - (int)c2) >= 2) {
                return false;
            }
        }

        return true;
    }
}