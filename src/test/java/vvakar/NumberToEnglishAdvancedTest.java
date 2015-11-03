package vvakar;

import org.junit.Test;
import static org.junit.Assert.*;
import static vvakar.NumberToEnglishInterpreter.interpret;

/**
 * Verify interpreted numbers composed of basic building blocks
 */
public class NumberToEnglishAdvancedTest {
    /** Powers of ten */
    @Test
    public void testHundred() {
        assertEquals("one hundred", interpret(100));
    }
    @Test
    public void testThousand() {
        assertEquals("one thousand", interpret(1000));
    }
    @Test
    public void testMillion() {
        assertEquals("one million", interpret(1000 * 1000));
    }

    /** Specified test cases */
    @Test
    public void test21() {
        assertEquals("twenty one", interpret(21));
    }

    @Test
    public void test105() {
        assertEquals("one hundred and five", interpret(105));
    }

    @Test
    public void test123() {
        assertEquals("one hundred and twenty three", interpret(123));
    }


    @Test
    public void test1005() {
        assertEquals("one thousand and five", interpret(1005));
    }

    @Test
    public void test1042() {
        assertEquals("one thousand and forty two", interpret(1042));
    }

    @Test
    public void test1105() {
        assertEquals("one thousand one hundred and five", interpret(1105));
    }

    @Test
    public void test56945781() {
        assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", interpret(56945781));
    }

    @Test
    public void test999999999() {
        assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", interpret(999999999));
    }
}

