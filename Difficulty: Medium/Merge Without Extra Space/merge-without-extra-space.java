class Solution {
    public void mergeArrays(int a[], int b[]) {
        // // code here
        // for(int i = 0;i<a.length;i++){
        //     if(a[i] >b[0]){
        //         int temp =a[i];
        //         a[i] = b[0];
        //         int k = 1;
        //         while(k<b.length && b[k] < temp){
        //             b[k-1]= b[k];
        //             k++;
        //         }
        //         b[k-1]=temp;
        //     }
        // }
        
        int i = a.length-1,j=0;
        while(i>=0 && j<b.length){
            if(a[i]<b[j]){
                i--;
            }else{
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
