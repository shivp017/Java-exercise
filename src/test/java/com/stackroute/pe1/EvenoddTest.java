package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenoddTest {

    Evenodd tomAndJerry;

    @Before
    public void setUp() {
        //arrange
        this.tomAndJerry = new Evenodd();
    }

    @Test
    public void givenIntegerShouldReturnNotInRange() {
        //act
        String actualResult = this.tomAndJerry.tomOrJerryFinder(19);
        //assert
        assertEquals("Not in between 20 and 30", actualResult);
    }



    @Test
    public void givenIntegerShouldReturnTom() {
        //act
        String actualResult = this.tomAndJerry.tomOrJerryFinder(21);
        //assert
        assertEquals("Tom", actualResult);
    }

    @Test
    public void givenIntegerShouldReturnJerry() {
        //act
        String actualResult = this.tomAndJerry.tomOrJerryFinder(20);
        //assert
        assertEquals("Jerry", actualResult);
    }
}