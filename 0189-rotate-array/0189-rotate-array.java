class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
         while (k > 0) {
            int t = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = t;
            k--;
        }
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}