package com.aibek;

class Addition {
    static String getSum(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            throw new java.lang.RuntimeException("Input must be two non-empty numbers!");

        StringBuilder sb = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        int cur = 0;
        int next = 0;

        while(i >= 0 || j >= 0 || cur > 0) {
            next = 0;
            if (i >= 0) cur += Character.getNumericValue(a.charAt(i--));
            if (j >= 0) cur += Character.getNumericValue(b.charAt(j--));
            if (cur >= 10) {
                next = cur / 10;
                cur %= 10;
            }
            sb.append(cur);
            cur = next;
        }

        return sb.reverse().toString();
    }
}
