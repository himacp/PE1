package com.stackroute.wave4;

import static org.junit.Assert.*;

import com.stackroute.wave4.VowelConsonant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)

public class VowelConsonantTest
{
    VowelConsonant object;

    @Before
    public void setUp() {
        object = new VowelConsonant();
    }

    @After
    public void tearDown() {
        object = null;
    }


    @Test
    public void demo() {
        VowelConsonant obj = new VowelConsonant();
        String expectedValue = "Consonant";
        //Act
        String actualValue = object.func('h');
        //Assert
        assertEquals(expectedValue, actualValue);
    }
        @Test
        public void demoSuccess1()
        {
         String expectedValue = "vowel";
        //Act
       String actualValue=object.func('a');
        //Assert
        assertEquals(expectedValue,actualValue);
    }

}