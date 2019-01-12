package com.stackroute.wave4;

import com.stackroute.wave4.ReverseNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)

public class ReverseNumberTest {

    @Test
    public void demo() {
        ReverseNumber obj = new ReverseNumber();
        String expectedValue = "123456789";
        //Act
        String actualValue=obj.function("987654321");
        //Assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void sucess() {
        ReverseNumber obj = new ReverseNumber();
        String expectedValue = "12345678910";
        //Act
        String actualValue=obj.function("01987654321");
        //Assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void faliure() {
        ReverseNumber obj = new ReverseNumber();
        String expectedValue = "12345678911";
        //Act
        String actualValue=obj.function("01987654321");
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }
}
