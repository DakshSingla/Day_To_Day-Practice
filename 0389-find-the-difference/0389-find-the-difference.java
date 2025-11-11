class Solution {
    public char findTheDifference(String s, String t) {
       char rrr = 0;
        for(char c:s.toCharArray()){
            rrr ^= c;
        }
        for(char c:t.toCharArray()){
           rrr ^= c;
        }
        return rrr;
        
    }
}