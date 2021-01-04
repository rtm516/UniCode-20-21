package com.rtm516.showcode.snowcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String getRecipient(String message, int position) {
        Pattern p = Pattern.compile("(@[\\w-]+)");
        Matcher m = p.matcher(message);

        int i = 0;
        while (m.find()) {
            i++;
            if (i == position) {
                return m.group(0).substring(1);
            }
        }

        return "";
    }
}