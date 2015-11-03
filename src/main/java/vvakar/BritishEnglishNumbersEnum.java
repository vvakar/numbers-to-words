package vvakar;

import java.util.EnumSet;
import java.util.SortedSet;
import java.util.TreeMap;

/**
 * Basic british english building blocks for positive integers in the range 0-999,999,999 inclusive.
 */
enum BritishEnglishNumbersEnum {
    zero(0),
    one(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9),
    ten(10),
    eleven(11),
    twelve(12),
    thirteen(13),
    fourteen(14),
    fifteen(15),
    sixteen(16),
    seventeen(17),
    eighteen(18),
    nineteen(19),
    twenty(20),
    thirty(30),
    forty(40),
    fifty(50),
    sixty(60),
    seventy(70),
    eighty(80),
    ninety(90),
    hundred(100),
    thousand(1000),
    million(1000 * 1000);

    // Enable reverse lookup by value
    private static final TreeMap<Integer, BritishEnglishNumbersEnum> byValue = new TreeMap<>();
    static {
        for(BritishEnglishNumbersEnum e :EnumSet.allOf(BritishEnglishNumbersEnum.class)) {
            byValue.put(e.n, e);
        }
    }

    private final int n;
    BritishEnglishNumbersEnum(int n) {
        this.n = n;
    }

    public static BritishEnglishNumbersEnum get(int n) {
        return byValue.get(n);
    }

    public static SortedSet<Integer> getFactors() {
        return byValue.descendingKeySet();
    }
}
