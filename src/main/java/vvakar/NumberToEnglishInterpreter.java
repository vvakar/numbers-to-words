package vvakar;

import static vvakar.BritishEnglishNumbersEnum.*;

/**
 * A way to convert numbers to british english.
 */
public class NumberToEnglishInterpreter {
    public static final int MIN = 0, MAX = 999999999;
    private static final int SENTINEL = MIN - 1;

    /**
     * Interpret integer to english.
     *
     * @param n integer to interpret. Must be in the range {@code MIN} - {@code MAX} inclusively
     * @return number spelled out in english
     * @throws IllegalArgumentException for bad input
     */
    public static String interpret(int n) {
        if (n < MIN || n > MAX) throw new IllegalArgumentException("Input not in allowed range: " + n);
        if (n == 0) return zero.name();

        final StringBuilder buf = new StringBuilder();
        int prevFactor = SENTINEL;

        while (n > 0) {
            final int factor = getFactors().tailSet(n).first();
            final int howManyUnits = n / factor;

            computePrefix(prevFactor, howManyUnits, factor, buf);
            buf.append(get(factor).name());

            n -= howManyUnits * factor;
            prevFactor = factor;
        }

        return buf.toString();
    }

    /**
     * Figure out the prefix by considering the previous (bigger) factor if any, current factor, and the number
     * of current units. Adjust {@code buf} accordingly.
     */
    private static void computePrefix(int prevFactor, int howManyUnits, int currentFactor, StringBuilder buf) {
        if (prevFactor != SENTINEL) buf.append(" ");

        if (prevFactor >= 100 && currentFactor < 100) {
            buf.append("and ");
        } else if (currentFactor >= 100) {
            buf.append(interpret(howManyUnits) + " ");
        }
    }
}
