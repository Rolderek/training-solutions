package catalog;



import org.junit.Test;

import java.util.Arrays;

import static catalog.Validator.isBlank;
import static catalog.Validator.isEmpty;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ValidatorsTest {

    @Test
    public void testIsBlank() {
        assertTrue(isBlank(null));
        assertTrue(isBlank(""));
        assertTrue(isBlank("    "));
        assertFalse(isBlank("a"));
        assertFalse(isBlank("     a       "));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(isEmpty(null));
        assertTrue(isEmpty(Arrays.asList()));
        assertFalse(isEmpty(Arrays.asList("aaa")));
        assertFalse(isEmpty(Arrays.asList("aaa", "bbb")));
    }
}