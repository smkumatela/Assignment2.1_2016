package za.ac.mkumsPrg;
import org.junit.Assert;
import org.junit.*;

/**
 * Created by Songezo on 2016-03-02.
 */
public class FailingTest {

    Failing failing;

    @Before
    public void setUp() throws Exception {
        failing = new Failing();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Ignore
    @Test
    public void testWrongString() throws Exception {
        Assert.fail(failing.wrong());
    }
}
