package za.ac.mkumsPrg;

import org.junit.*;

/**
 * Created by Songezo on 2016-03-01.
 */
public class ObjectEqualityTest {

    private ObjectEquality oE;

    @Before
    public void setUp() throws Exception {
        oE = new ObjectEquality();
    }

    @After
    public void tearDown() throws Exception {
    }

    //@Ignore
    @Test
    public void testGender() throws Exception {

        int one = oE.num1();
        int two = oE.num2();

        //Assert.fail("fail");
        Assert.assertEquals(one, two);


    }
}
