class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length/2;
        HashSet<Integer> tab = new HashSet<>();
        for(int i = 0;i<candyType.length;i++){
            tab.add(candyType[i]);
        }
        return Math.min(tab.size(),n);
    }
}