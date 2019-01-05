import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)

public class VowelConsonantTest
{

    @Test
    public void demo()
    {
        VowelConsonant obj = new VowelConsonant();
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