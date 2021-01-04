package com.rtm516.showcode.ready_player_x;

public class Cipher {
    public static String halliday(String message) {
        StringBuilder out = new StringBuilder();

        // Loop and parse all characters in the message
        for(char c : message.toCharArray()) {
            // Check if the character is alphabetic
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                int inc = 65;

                // Check if uppercase
                if (c >= 97) {
                    inc = 97;
                }

                // Calculate the new character and append it
                out.append((char)((c + 13 - inc) % 26 + inc));
            } else {
                // Add the symbol
                out.append(c);
            }
        }

        return out.toString();
    }
}
