package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-02.
 */
public class FailingTest {

    private Failing fail;

    @Before
    public void setUp() throws Exception {
        fail = new Failing();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testWrongString() throws Exception {
        Assert.fail(fail.wrong());
    }
}
