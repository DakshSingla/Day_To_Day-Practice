class Solution {
    public List<Integer> majorityElement(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<Integer> ans = new LinkedList<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length;
        for(Map.Entry<Integer, Integer>  e:map.entrySet()){
            if(e.getValue() > n/3){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}