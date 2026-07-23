class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int n:students){
            q.offer(n);
        }
        for(int i = sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int count = 0;
        while(!q.isEmpty() && count<q.size()){
            if(q.peek() == st.peek()){
                q.poll();
                st.pop();
                count= 0;
            }else{
                count++;
                q.offer(q.poll());
            }
        }
        return q.size();
    }
}