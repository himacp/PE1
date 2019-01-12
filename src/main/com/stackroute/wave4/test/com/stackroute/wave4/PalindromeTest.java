package com.stackroute.wave4;

import com.stackroute.wave4.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome object;

    @Before
    public void setUp() {
        object = new Palindrome();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void numberPalindrome() throws Exception {

        int expectedValue = 12244221;
        //Act
        int actualValue = object.palindromefunction(12244221);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void numberPalindromesuccess() throws Exception {

        int expectedValue = 122454221;
        //Act
        int actualValue = object.palindromefunction(122454221);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void numberPalindromefaliure() throws Exception {

        int expectedValue = 1222244221;
        //Act
        int actualValue = object.palindromefunction(12244221);
        //Assert
        assertNotEquals(expectedValue, actualValue);
    }
}