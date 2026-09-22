class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n-2;i++){
            int a = i+1;
            int b = n-1;
            while(a<b){
                int sum = nums[i]+nums[a]+nums[b];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[a],nums[b]));
                    a++;
                    b--;
                }
                else if(sum<0) a++;
                else b--;
            }
        }
        return new ArrayList<>(ans);
    }
}
