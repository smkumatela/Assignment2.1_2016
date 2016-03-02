package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-01.
 */
public class ObjectIdentityTest {

    ObjectIdentity Obj;

    @Before
    public void setUp() throws Exception {
        Obj = new ObjectIdentity();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testEqulity() throws Exception {
        Assert.assertSame(Obj.objectSecond(), Obj.objectFirst());
    }

}
