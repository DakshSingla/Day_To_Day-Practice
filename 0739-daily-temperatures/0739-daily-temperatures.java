class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack();
        // int count = 0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int a = st.pop();
                ans[a] = i - a;
            }
            st.push(i);
        
        }
        return ans;
    }
}