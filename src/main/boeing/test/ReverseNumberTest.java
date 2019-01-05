import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)

public class ReverseNumberTest {

    @Test
    public void demo() {
        ReverseNumber obj = new ReverseNumber();
        String expectedValue = "123";
        //Act
        String actualValue=obj.function("321");
        //Assert
        assertEquals(expectedValue,actualValue);
    }


}
