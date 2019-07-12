package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rev;

    @Before
    public void setUp() {
        //arrange
        this.rev = new ReverseString();
    }

    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String actualResult = rev.reverseString("Hello");
        //Assert
        assertEquals("olleH", actualResult);
    }
    @Test
    public void givenStringShouldNotReturnTheReverse() {
        //act
        String actualResult = rev.same("shiv");
        //Assert
        assertEquals("shiv", actualResult);
    }
}