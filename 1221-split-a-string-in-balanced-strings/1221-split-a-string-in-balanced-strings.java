class Solution {
    public int balancedStringSplit(String s) {
        int R = 0;
        int L = 0;
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='R') R++;
            else if (c=='L') L++;
            if(R==L){
                count++;
                L=0;
                R=0;
            }
        }
        return count;
    }
}