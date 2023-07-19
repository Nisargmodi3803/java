import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TestLogic 
{
    @Test
    public void testFindMax()
    {
        // System.out.println("This is test");
        assertEquals(4,calculation.findMax(new int[]{1,2,3,4}));
        // assertEquals(4,calculation.findMax(new int[]{1,2,3,4,5}));// Test case fail because 5 is highest than 4.
    }
}
