package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest {

    @Test
    public  void test1 () {
        Pallindrome pobj = new Pallindrome();
        String A= pobj.pallindromesum(22);
        String e = "Input is pallindrome & lesser than 25";
        assertEquals(e,A);
    }

    @Test
    public void test2() {
        Pallindrome pobj = new Pallindrome();
        String A= pobj.pallindromesum(188881);
        String e = "Input is pallindrome & More than 25";
        assertEquals(e,A);
    }


}