import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

    @RunWith(JUnit4.class)

    public class PalindromeTest {

        @Test
        public void demo() {
            Palindrome obj = new Palindrome();
            String expectedValue = "123321 is a palindrome and sum of even number is less than 25.";
            //Act
            String actualValue=obj.required(123321);
            //Assert
            assertEquals(expectedValue,actualValue);
        }




}