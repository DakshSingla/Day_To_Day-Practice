class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i) =='('){
                st.push(i);
            }
            else if(sb.charAt(i) ==')'){
                int start = st.pop();
                swap(sb,start+1,i-1);
                sb.deleteCharAt(i);
                sb.deleteCharAt(start);
                i-=2;
            }
        }
        return sb.toString();
    }
    public void swap(StringBuilder sb, int l, int r){
        while(l<r){
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r,temp);
            l++;
            r--;
        }
    }
}