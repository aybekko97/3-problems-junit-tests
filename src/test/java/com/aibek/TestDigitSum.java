package com.aibek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestDigitSum {
    @Test
    void whenNumberIsZero(){
        int output = DigitSum.calculate(0);
        assertEquals(0, output);
    }
    @Test
    void whenNumberIsSingleDigit(){
        int output = DigitSum.calculate(8);
        assertEquals(8, output);
    }
    @Test
    void whenNumberIsTwoDigit(){
        int output = DigitSum.calculate(97);
        assertEquals(16, output);
    }
    @Test
    void whenHundred(){
        int output = DigitSum.calculate(100);
        assertEquals(1, output);
    }
    @Test
    void whenThousand(){
        int output = DigitSum.calculate(1000);
        assertEquals(1, output);
    }
    @Test
    void whenMaxInt(){
        int output = DigitSum.calculate(Integer.MAX_VALUE);
        assertEquals(46, output);
    }
    @Test
    void NegativeInput(){
        try {
            int output = DigitSum.calculate(-1);
            fail();
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Input must be non-negative number!");
        }
    }
}
