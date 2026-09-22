class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi = 0;
        for(int i = 0;i<s.length();i++){
            Set<Character> st = new HashSet<>();
            int count = 0;
            for(int j = i;j<s.length();j++){
                if(st.contains(s.charAt(j))){
                    break;
                }
                st.add(s.charAt(j));
                count++;
                maxi = Math.max(maxi,count);                
            }
        }
        return maxi;
    }
}
