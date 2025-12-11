class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack();
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                int a = st.pop();
                ans[a] = prices[a] - prices[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int a = st.pop();
            ans[a] = prices[a];
        }
        return ans;
    }
}