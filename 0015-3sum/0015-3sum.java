class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0;i<nums.length -2;i++){
            int a = i+1;
            int b = nums.length-1;
            while(a<b){
                int sum = nums[i]+nums[a]+nums[b];
                if(sum ==0){
                    st.add(Arrays.asList(nums[i],nums[a],nums[b]));
                    a++;
                    b--;
                }
                else if(sum<0){
                    a++;
                }
                else
                b--;
                
            }
        }
        return new ArrayList<>(st);
    }
}
