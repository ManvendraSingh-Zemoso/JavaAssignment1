package manvendra.assignment5;

import org.junit.Test;
import static manvendra.assignment5.Regex.TestRegex;
import static org.junit.Assert.*;

/**
 * Created by zemoso on 21/7/17.
 * This is the test case for manvendra.assignment5.Regex.TestRegex.
 * @author Manvendra
 */
public class RegexTest {
    @Test
    /**
     * This is used to test the TestRegex output.
     */
    public void test() throws Exception {
        assertEquals(false,TestRegex("Hello,This is Manvendra"));
    }
}