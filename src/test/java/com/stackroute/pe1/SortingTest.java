package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class SortingTest {
    Sorting rev;

    @Before
    public void setUp() {
        //arrange
        this.rev = new Sorting();
    }

    @Test
    public void sumofinputgreaterthan15() {
        //act
        boolean b = rev.num(8876);
        //Assert

       assertEquals(true,b);
    }
    @Test
    public void sumofinputlesserthan15() {
        //act
        boolean b = rev.num(6);
        //Assert

        assertEquals(false,b);
    }
}