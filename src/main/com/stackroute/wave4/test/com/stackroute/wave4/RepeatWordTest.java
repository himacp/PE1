package com.stackroute.wave4;


import com.stackroute.wave4.RepeatWord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class RepeatWordTest {
    RepeatWord object;

    @Before
    public void setUp() {
        object = new RepeatWord();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void repeatWordTest() {
        RepeatWord repeatWord = new RepeatWord();
        String expectedValue = "stackroutetete";
        //Act
        String actualValue = repeatWord.repeatNtimes("stackroute", 2);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void repeatWordTestsuccess() {
        RepeatWord repeatWord = new RepeatWord();
        String expectedValue = "Himamama";
        //Act
        String actualValue = repeatWord.repeatNtimes("Hima", 2);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void repeatWordTestfaliure() {
        RepeatWord repeatWord = new RepeatWord();
        String expectedValue = "stackroutetete";
        //Act
        String actualValue = repeatWord.repeatNtimes("stackroute", 3);
        //Assert
        assertNotEquals(expectedValue, actualValue);

    }
}

