package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;
    @Before
    public void setUp(){
        //arrange
        System.out.println("Inside Before");
        this.junitDemo= new JunitDemo();
    }

    @After
    public void tearDown(){
        System.out.println("Inside After");
        junitDemo=null;
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @Test
    public void givenTwoStringsShouldReturnConcatedUpperString() {

        //act
        String actualResult=junitDemo.concatAndUpperCase("hello","world");
        //assert
        assertNotNull(actualResult);
        assertEquals("HELLOWORLD",actualResult);


    }
    @Test
    public void givenAStringAndNullShouldReturnErrorMessage(){

        //act
        String actualResult=junitDemo.concatAndUpperCase("hello",null);
        //assert
        assertNotNull(actualResult);
        assertEquals("Null Value Not Allowed",actualResult);
    }
    @Test
    public void givenStringShouldReturnTheReverse(){
        //act
        String actualResult=junitDemo.reverseString("Hello");
        //Assert
        assertEquals("olleH",actualResult);
    }

//    @Test
//    public void givenNullShouldThrowNullPointException(){
//        //act
//        String actualResult=junitDemo.reverseString(null);
//
//    }
}