package manvendra.assignment5;

import org.junit.Test;
import static manvendra.assignment5.Regex.TestRegex;
import static org.junit.Assert.*;

/**
 * Created by zemoso on 21/7/17.
 */
public class RegexTest {
    @Test
    public void test() throws Exception {
        assertEquals(false,TestRegex("Hello,This is Manvendra"));
    }
}