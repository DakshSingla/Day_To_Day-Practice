class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i = 0,j=arr.length-1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;j--;
        }
    }
}