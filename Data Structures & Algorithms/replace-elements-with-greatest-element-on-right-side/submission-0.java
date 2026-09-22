class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0;i < arr.length;i++){
            int maxi = -1;
            for(int j = i+1;j<arr.length;j++){
                maxi = Math.max(maxi,arr[j]);
            }
            ans[i] = maxi;
        }
        return ans;
    }
}