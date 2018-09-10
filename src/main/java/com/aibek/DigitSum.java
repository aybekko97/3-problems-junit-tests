package com.aibek;

class DigitSum {
    static int calculate(int x){
        if (x < 0)
            throw new java.lang.RuntimeException("Input must be non-negative number!");
        if (x < 10)
            return x;
        return calculate(x / 10) + x % 10;
    }
}
