import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCases 
{
    @BeforeClass
    static public void BeforeClassMsg()
    {
        System.out.println("I'm BeforeClass");
        System.out.println("*********************************************");
    }

    @Before
    public void BeforeMsg()
    {
        System.out.println("I'm Before");
    }

    @Test
    public void TestCubeRoot()
    {
        System.out.println("I'm CubeTest");
        assertEquals(27, CubeRoot.cube(3));     //True Case.
        // assertEquals(27, CubeRoot.cube(4));     //Fail Case

    }

    @Test
    public void TestHighestNum()
    {
        System.out.println("I'm HighestNum Test");
        assertEquals(25,Highest.Highest_num(25, 5) );       //True Case.
        // assertEquals(25,Highest.Highest_num(25, 50) );      //Fail Case.
    }

    @Test
    public void TestFindMax()
    {
        System.out.println("I'm FindMax Test");
        assertEquals(4,calculation.findMax(new int []{1,2,3,4}));       //True Case.
        // assertEquals(4,calculation.findMax(new int []{1,2,3,4,5}) );     //Fail Case.
    }

    @After
    public void AfterMsg()
    {
        System.out.println("I'm After");
        System.out.println("***********************************************************");
    }

    @AfterClass
    static public void AfterClassMsg()
    {
        System.out.println("I'm AfterClass");
    }
}
