package com.rtm516.showcode.the_heist;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{

    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(11, solution.calculateCapacity(new int[] { 1, 4, 2, 1, 1, 2, 5, 3, 4 }));
    }
}