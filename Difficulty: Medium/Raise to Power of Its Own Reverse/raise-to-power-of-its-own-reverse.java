class Solution {
    public int reverseExponentiation(int n) {
        // code here
        String sb = new StringBuilder(String.valueOf(n)).reverse().toString();
        int ans = Integer.parseInt(sb);
        return (int)Math.pow(n,ans);
    }
}
