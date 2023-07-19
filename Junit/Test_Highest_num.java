import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;


public class Test_Highest_num 
{
    @Test
    public void TestHighestNum()
    {
        assertEquals(25,Highest.Highest_num(25, 5));
        // assertEquals(25,Highest.Highest_num(25, 50)); // Test Case Fail Because 50 is greater than 25.
    }
}
