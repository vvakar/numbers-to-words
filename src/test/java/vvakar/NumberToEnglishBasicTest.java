package vvakar;

import org.junit.Test;
import static org.junit.Assert.*;
import static vvakar.NumberToEnglishInterpreter.*;

/**
 * Verify basic building blocks
 */
public class NumberToEnglishBasicTest {

    /** Basic numbers 0-19 */
    @Test
    public void testZero() {
        assertEquals("zero", interpret(0));
    }
    @Test
    public void testOne() {
        assertEquals("one", interpret(1));
    }

    @Test
    public void testTwo() {
        assertEquals("two", interpret(2));
    }

    @Test
    public void testThree() {
        assertEquals("three", interpret(3));
    }
    @Test
    public void testFour() {
        assertEquals("four", interpret(4));
    }
    @Test
    public void testFive() {
        assertEquals("five", interpret(5));
    }
    @Test
    public void testSix() {
        assertEquals("six", interpret(6));
    }
    @Test
    public void testSeven() {
        assertEquals("seven", interpret(7));
    }
    @Test
    public void testEight() {
        assertEquals("eight", interpret(8));
    }

    @Test
    public void testNine() {
        assertEquals("nine", interpret(9));
    }
    @Test
    public void testTen() {
        assertEquals("ten", interpret(10));
    }

    @Test
    public void testEleven() {
        assertEquals("eleven", interpret(11));
    }
    @Test
    public void testTwelve() {
        assertEquals("twelve", interpret(12));
    }
    @Test
    public void testThriteen() {
        assertEquals("thirteen", interpret(13));
    }
    @Test
    public void testFourteen() {
        assertEquals("fourteen", interpret(14));
    }
    @Test
    public void testFifteen() {
        assertEquals("fifteen", interpret(15));
    }
    @Test
    public void testSixteen() {
        assertEquals("sixteen", interpret(16));
    }
    @Test
    public void testSeventeen() {
        assertEquals("seventeen", interpret(17));
    }
    @Test
    public void testEighteen() {
        assertEquals("eighteen", interpret(18));
    }
    @Test
    public void testNineteen() {
        assertEquals("nineteen", interpret(19));
    }


    /** Tens */

    @Test
    public void testTwenty() {
        assertEquals("twenty", interpret(20));
    }
    @Test
    public void testThirty() {
        assertEquals("thirty", interpret(30));
    }
    @Test
    public void testForty() {
        assertEquals("forty", interpret(40));
    }
    @Test
    public void testFifty() {
        assertEquals("fifty", interpret(50));
    }
    @Test
    public void testSixty() {
        assertEquals("sixty", interpret(60));
    }
    @Test
    public void testSeventy() {
        assertEquals("seventy", interpret(70));
    }
    @Test
    public void testEighty() {
        assertEquals("eighty", interpret(80));
    }
    @Test
    public void testNinety() {
        assertEquals("ninety", interpret(90));
    }



    /** Check inputs */
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        interpret(MIN - 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHugeInput() {
        interpret(MAX + 1);
    }
}
