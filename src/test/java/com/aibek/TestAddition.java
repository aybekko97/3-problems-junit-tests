package com.aibek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestAddition {
    @Test
    void sumOfZeroAndEmptyNumber() {
        try {
            String output = Addition.getSum("0","");
            fail();
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Input must be two non-empty numbers!");
        }
    }

    @Test
    void sumOfEmptyAndNonEmptyNumber() {
        try {
            String output = Addition.getSum("","159");
            fail();
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Input must be two non-empty numbers!");
        }
    }

    @Test
    void sumOfZeroes() {
        String output = Addition.getSum("0","0");
        assertEquals("0", output);
    }

    @Test
    void sumOfNumberAndZero() {
        String output = Addition.getSum("144","0");
        assertEquals("144", output);
    }

    @Test
    void sumOfDigitsWithResultLessThan10() {
        String output = Addition.getSum("3","4");
        assertEquals("7", output);
    }

    @Test
    void sumOfDigitsWithResultGreaterThan10() {
        String output = Addition.getSum("9","7");
        assertEquals("16", output);
    }

    @Test
    void sumOfDigitsWithResultEqualTo10() {
        String output = Addition.getSum("6","4");
        assertEquals("10", output);
    }

    @Test
    void sumOf2DigitAnd3DigitNumbers() {
        String output = Addition.getSum("68","159");
        assertEquals("227", output);
    }

    @Test
    void sumOf2DigitNumbers() {
        String output = Addition.getSum("99","99");
        assertEquals("198", output);
    }

    @Test
    void sumOfTwoLargeNumbers() {
        String a = "10000000000000000000000000000000328";
        String b = "96000000060003000000000000000000909";
        String output = Addition.getSum(a,b);
        assertEquals("106000000060003000000000000000001237", output);
    }

    @Test
    void sumOfLargeAndSmallNumber() {
        String a = "10000000000000000000000000000000328";
        String b = "2993";
        String output = Addition.getSum(a,b);
        assertEquals("10000000000000000000000000000003321", output);
    }

    @Test
    void sumOfSmallAndLargeNumber() {
        String a = "2993";
        String b = "10000000000000000000000000000000328";
        String output = Addition.getSum(a,b);
        assertEquals("10000000000000000000000000000003321", output);
    }
}
