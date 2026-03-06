class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;
        long sum = 0;
        long[] temp = new long[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]> arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = (long)arr[i] * (i+1);
            }
            else{
                int prev = st.peek();
                temp[i] = temp[prev] + (long)arr[i] * (i-prev);
            }
            st.push(i);
            sum = (sum + temp[i]) % mod;
        }
        return (int)sum;

    }
}