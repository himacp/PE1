import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import org.junit.*;
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
}