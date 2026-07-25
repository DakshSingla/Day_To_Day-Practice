class Solution {
    public boolean isBalanced(String s) {
        // code here
        if(s.charAt(0)==']' || s.charAt(0)==')' || s.charAt(0)=='}'){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='[' || ch=='(' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                if(ch==')' && st.peek() =='('){
                    st.pop();
                }
                else if(ch==']' && st.peek() =='['){
                    st.pop();
                }
                else if(ch=='}' && st.peek() =='{'){
                    st.pop();
                }
                else return false;
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
