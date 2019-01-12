package com.stackroute.wave4;

import com.stackroute.wave4.UnspecifiedSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnspecifiedSumTest {
    UnspecifiedSum object;

    @Before
    public void setUp() {
        object = new UnspecifiedSum();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void sumTest() throws Exception {

        int expectedValue = 40;
        //Act
        int actualValue = object.total(12);
        actualValue = object.total(14);
        actualValue = object.total(14);
        //Assort
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void sumTestSuccess() throws Exception {

        int expectedValue = 24;
        //Act
        int actualValue = object.total(12);
        actualValue = object.total(12);
        actualValue = object.total(0);
        //Assort
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void sumTestFailure() throws Exception {

        int expectedValue = 45;
        //Act
        int actualValue = object.total(12);
        actualValue = object.total(14);
        actualValue = object.total(14);
        //Assort
        assertNotEquals(expectedValue,actualValue);
    }
}
