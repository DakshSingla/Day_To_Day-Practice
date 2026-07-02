class Solution {
    public String countAndSay(int n) {
        String ans ="1";
        while(n-->1){
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while(i < ans.length()){
                int count = 0;
                char ch = ans.charAt(i);
                while(i < ans.length() && ans.charAt(i) == ch){
                    count++;
                    i++;
                }
                sb.append(count);
                sb.append(ch);
            }
            ans = sb.toString();
        }
        return ans;
    }
}