class Solution {
    public int findSmallest(int[] arr) {
        // code here
        Arrays.sort(arr);
        long ans = 1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>ans){
                return (int)ans;
            }ans+=arr[i];
        }
        return (int)ans;
    }
}