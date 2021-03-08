package com.rtm516.showcode.alarics_treasure;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{

    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(1961, solution.parseRomanNumerals("MCMLXI"));
    }
}
