package manvendra.assignment4;

import org.junit.Test;

import static manvendra.assignment4.ExceptionHandling.trycatch;
import static org.junit.Assert.*;

/**
 * Created by zemoso on 24/7/17.
 */
public class ExceptionHandlingTest {
    @Test
    public void main() throws Exception {
        assertEquals("java.lang.NullPointerException",trycatch(14));
        assertEquals("manvendra.assignment4.NewException1",trycatch(12));
        assertEquals("manvendra.assignment4.NewException2",trycatch(21));
        assertEquals("manvendra.assignment4.NewException3",trycatch(5));
    }

}