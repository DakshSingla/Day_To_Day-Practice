class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += s.charAt(i) - 'a' + 1;
        }
        int leftSum = 0;
        for (int i = 0; i < n - 1; i++) {
            leftSum += s.charAt(i) - 'a' + 1;
            int rightSum = total - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}
