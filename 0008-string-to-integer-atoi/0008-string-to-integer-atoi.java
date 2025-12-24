class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0;
        int sign = 1;
        long num = 0;

        // 1. Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        // 3. Convert digits
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') break;

            num = num * 10 + (ch - '0');

            // 4. Handle overflow manually
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * num);
    }
}
