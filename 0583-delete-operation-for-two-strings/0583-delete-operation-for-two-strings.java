class Solution {
    public int minDistance(String word1, String word2) {
        int lcs = helper(word1,word2,0,0);
        return ((word1.length() - lcs)+(word2.length() - lcs));
    }
    private int helper(String w1,String w2,int i ,int j){
        if(i== w1.length()||j== w2.length()) return 0;
        if(w1.charAt(i) == w2.charAt(j)) return 1 + helper(w1,w2,i+1,j+1);
        return Math.max(helper(w1,w2,i+1,j),helper(w1,w2,i,j+1));
    };
}