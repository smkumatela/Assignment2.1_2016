package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void testGender() throws Exception {
        Assert.assertEquals(oE.num2(), oE.num1());
    }
}
