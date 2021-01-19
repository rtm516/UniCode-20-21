package com.rtm516.showcode.attack_cleanup;

public class AttackCleanup {
    public static String restoreData(String message) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        // Loop all characters
        for (char c : message.toCharArray()) {
            // Check what character
            switch (c) {
                case 'z':
                    // Append the count amount of chars to the final string
                    sb.append(new String(new char[count]).replace('\0', 'a'));
                    count = 1;
                    break;

                case 'g':
                    // Append the count amount of chars to the final string
                    sb.append(new String(new char[count]).replace('\0', 't'));
                    count = 1;
                    break;

                case 't':
                    // Append the count amount of chars to the final string
                    sb.append(new String(new char[count]).replace('\0', 'g'));
                    count = 1;
                    break;

                case 'x':
                    // Append the count amount of chars to the final string
                    sb.append(new String(new char[count]).replace('\0', 'c'));
                    count = 1;
                    break;

                default:
                    // If we are given a number store it for expansion
                    if (Character.isDigit(c)) {
                        count = Integer.parseInt(String.valueOf(c));
                    }
                    break;
            }
        }

        return sb.toString();
    }
}