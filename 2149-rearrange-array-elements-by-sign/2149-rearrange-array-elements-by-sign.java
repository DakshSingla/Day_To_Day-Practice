class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        for(int i =0;i<nums.length;i++){
            if(0<=nums[i]) q1.add(nums[i]);
            else q2.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        int i = 0;
        while(!q1.isEmpty() && !q2.isEmpty()){
            ans[i++] = q1.poll();
            ans[i++] = q2.poll();
        }
        return ans;
    }
}