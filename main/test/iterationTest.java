import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)

public class  iterationTest
{
    @Test
    public void demo()
    {
        Iteration obj = new Iteration();
        String expectedValue = "1 2 2 3 3 3 ";
        //Act
        String actualValue=obj.function(3);
        //Assert
        assertEquals(expectedValue,actualValue);

    }


}