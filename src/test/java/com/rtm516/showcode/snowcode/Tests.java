package com.rtm516.showcode.snowcode;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{

    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals("JoeBloggs", solution.getRecipient("@JoeBloggs yo", 1));
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertEquals("FredBloggs", solution.getRecipient("Hey @Joe_Bloggs what time are we meeting @FredBloggs?", 2));
    }
}