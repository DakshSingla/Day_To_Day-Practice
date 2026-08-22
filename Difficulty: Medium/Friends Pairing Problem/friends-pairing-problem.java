class Solution {
    public int countFriendsPairings(int n) {
        if(n<=2) return n;
        int s = countFriendsPairings(n-1);
        int p = (n-1)*countFriendsPairings(n-2);
        return s+p;
        
    }
}
