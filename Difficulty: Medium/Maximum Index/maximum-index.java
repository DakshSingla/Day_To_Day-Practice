class Solution {
    int maxIndexDiff(int[] arr) {
        int n = arr.length;
        int[][] pairs = new int[n][2];
        for (int i = 0;i<n;i++) {
            pairs[i][0]= arr[i];
            pairs[i][1]=i;
        }
        Arrays.sort(pairs,(a, b) -> a[0] - b[0]);

        int minIndex =Integer.MAX_VALUE;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            int index = pairs[i][1];
            if (minIndex != Integer.MAX_VALUE) {
                ans = Math.max(ans, index - minIndex);
            }
            minIndex = Math.min(minIndex, index);
        }
        return ans;
    }
}