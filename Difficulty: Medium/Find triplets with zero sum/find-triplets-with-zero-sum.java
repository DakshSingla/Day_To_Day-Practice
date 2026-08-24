class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.ar
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            int l = i+1;
            int sum = Integer.MAX_VALUE;
            int r = arr.length-1;
            while(l<r){
                sum= arr[i]+arr[l]+arr[r];
                if(sum==0) return true;
                else if(sum>0){
                    r--;
                }
                else if(sum<0){
                    l++;
                }
                
            }
        }return false;
    }
}