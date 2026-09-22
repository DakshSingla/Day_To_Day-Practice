class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count : freq){
            if(count!= 0){
                return false;
            }
        }
        return true;
    }
}
