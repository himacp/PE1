package com.stackroute.wave4;

import com.stackroute.wave4.OriginalNumber;
    import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

    @RunWith(JUnit4.class)
    public class OriginalNumberTest {

        OriginalNumber object;

            @Before
            public void setUp()
            {
                object = new  OriginalNumber();
            }

            @After
            public void tearDown() {
                object = null;
            }

        @Test
        public void OriginalNumSuccessTest() {

            String actualstr = object.guess(23, 23);
            String expectedstr = "Number guessed matches the original number";
            assertEquals(expectedstr, actualstr);
        }

        @Test
        public void OriginalNumFailureTest() {

            String actualstr = object.guess(45,23);
            String expectedstr = "Number guessed is more than the original number";
            assertNotEquals(expectedstr, actualstr);
        }

    }