import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CapitalLetterTest
{
    @Test
    public void demo()
    {
        CapitalLetter obj = new CapitalLetter ();
        String expectedValue = "Capital Letter";
        //Act
        String actualValue=obj.func('A');
        //Assert
        assertEquals(expectedValue,actualValue);

    }


}