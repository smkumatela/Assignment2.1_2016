package za.ac.mkumsPrg;

/**
 * Created by Songezo on 2016-03-02.
 */
public class ExceptionsC {

    public int method1(int i) throws IllegalArgumentException{
        if (i<0)
            throw new IllegalArgumentException("value cannot be negative");
        System.out.println("The positive value is " + i );
        return 0;
    }

}
