package manvendra.assignment8;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 25/7/17.
 */
public class CharactersCountTest {
    @Test
    public void maps() throws Exception {
        Map<Character,Integer> m=new HashMap<>();
        m.put('M',1);
        m.put('a',1);
        m.put('n',2);
        m.put('u',1);
        assertEquals(m,CharactersCount.maps("Mannu"));
    }
}