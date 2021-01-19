package com.rtm516.showcode.attack_cleanup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests
{

    @Test
    public void test1()
    {
        AttackCleanup solution = new AttackCleanup();

        assertEquals("atgcgcatgcgca", solution.restoreData("zgtxtxzgtxtxz"));
    }

    @Test
    public void test2()
    {
        AttackCleanup solution = new AttackCleanup();

        assertEquals("tgctgcataaattttttttggggcatttaaa", solution.restoreData("gtxgtxzg3z8g4txz3g3z"));
    }
}