import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)

public class vowelTest
{

    @Test
    public void demo()
    {
        Vowel obj = new Vowel();
        String expectedValue = "Consonant";
        //Act
        String actualValue=obj.func('h');
        //Assert
        assertEquals(expectedValue,actualValue);

        expectedValue = "vowel";
        //Act
        actualValue=obj.func('a');
        //Assert
        assertEquals(expectedValue,actualValue);
    }





}