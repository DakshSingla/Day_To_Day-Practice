class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> sol = new ArrayList<>();
        int deci = 0;
        for(int c:nums){
            deci = (2*deci+c)%5;
            sol.add(deci%5 ==0);
        }
        return sol;
    }
}