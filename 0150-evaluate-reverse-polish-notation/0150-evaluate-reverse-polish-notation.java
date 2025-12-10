class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String i : tokens){
                if(i.equals("+")){
                    st.push(st.pop() +  st.pop());
                }
                else if(i.equals("-")){
                    int s = st.pop();
                    int f = st.pop();
                    st.push(f-s);
                }
                else if(i.equals("/")){
                    int s = st.pop();
                    int f = st.pop();
                    st.push(f/s);
                }
                else if(i.equals("*")){
                    st.push(st.pop()*st.pop());
                }
                else
                    st.push(Integer.parseInt(i));
        }
        return st.peek();
    }
}