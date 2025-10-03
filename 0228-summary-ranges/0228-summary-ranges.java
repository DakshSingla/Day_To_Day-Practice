class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums.length!=j+1 &&nums[j+1]==nums[j]+1){
                j++;
            }
            else{ 
            if(i==j){
                ans.add(String.valueOf(nums[i]));
            }
            else{
                ans.add(nums[i] +"->"+nums[j]);
            }
             i=j+1;
             j++;
            }
        }
        return ans;
    }
}