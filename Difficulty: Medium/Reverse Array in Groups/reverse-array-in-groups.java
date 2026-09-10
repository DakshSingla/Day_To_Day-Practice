class Solution {
    public void rev(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
    public void reverseInGroups(int[] arr, int k) {
        // code her
        for(int i = 0;i<arr.length;i+=k){
            int j = Math.min(i+k-1,arr.length-1);
            rev(arr,i,j);
        }
        
    }
}