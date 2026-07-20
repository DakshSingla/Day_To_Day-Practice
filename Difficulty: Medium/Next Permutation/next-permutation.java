class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr, i,j);
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int check = -1;
        int n = arr.length;
        for(int i= n-2;i>=0;i--){
            if(arr[i] <arr[i+1]){
                check = i;
                break;
            }
        }
        if(check == -1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i = n-1;i>0;i--){
            if(arr[i] > arr[check]){
                swap(arr,i,check);
                break;
            }
        }
        reverse(arr,check +1,n-1);
        
    }
}