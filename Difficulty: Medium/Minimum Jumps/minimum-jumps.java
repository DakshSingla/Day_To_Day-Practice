class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1) return 0;
        if(arr[0] == 0) return -1;
        int cur = 0;
        int far = 0;
        int jump = 0;
        for(int i = 0;i<n-1;i++){
            far = Math.max(far,i+arr[i]);
            if(i == cur){
                jump++;
                cur = far;
                if(cur >= n-1){
                    return jump;
                }
                if(cur== i){
                    return -1;
                }
            }
        }
        return -1;
    }
}