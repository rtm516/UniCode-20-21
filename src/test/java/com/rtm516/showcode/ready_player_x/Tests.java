package com.rtm516.showcode.ready_player_x;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void test1()
    {
        Cipher solution = new Cipher();

        assertEquals("Pelfgny Xrl", solution.halliday("Crystal Key"));
    }

    @Test
    public void test2()
    {
        Cipher solution = new Cipher();

        assertEquals("Beo bs Bfhibk", solution.halliday("Orb of Osuvox"));
    }
}