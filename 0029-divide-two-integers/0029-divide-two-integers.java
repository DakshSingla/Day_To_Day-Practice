class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if(dividend == divisor) return 1;
        boolean sign = true;
        if(dividend >=0 && divisor < 0) sign = false;
        if(dividend <= 0 && divisor > 0) sign = false;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long ans = 0;
        while(n>=d){
            int cut = 0;
            while(n>=(d<<(cut+1))){
                cut++;
            }
                ans += (1<<cut);
                n -= d<<cut;
            if(ans == (1<<31)&& sign)
            return Integer.MAX_VALUE;
            if(ans == (1<<31)&& !sign)
            return Integer.MIN_VALUE;
        }
       return sign ?(int)ans :(int)-ans;
    }
}