class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            int l = i+1;
            int e = arr.length-1;
            while(l<e){
                sum = arr[i]+arr[l]+arr[e];
                if(sum>target){
                    e--;
                }
                else if(sum<target){
                    l++;
                }
                else return true;
            }
        }
        return false;
    }
}
