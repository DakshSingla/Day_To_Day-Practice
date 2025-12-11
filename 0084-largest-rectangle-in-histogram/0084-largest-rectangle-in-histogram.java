class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        Stack<Integer> st = new Stack();
        int n = heights.length;
        int[] r = new int[n];
        int[] l = new int[n];
        for(int i = n-1 ;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            r[i] = st.isEmpty() ? n:st.peek();
            st.push(i);

        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            l[i] = st.isEmpty() ? -1:st.peek();
            st.push(i);
        }
        for(int i = 0;i<n;i++){
            int w = r[i]-l[i]-1;
            int cur = heights[i]*w;
            ans = Math.max(ans,cur);
        }
        return ans;
    }
}