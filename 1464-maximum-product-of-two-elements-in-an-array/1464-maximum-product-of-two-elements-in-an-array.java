class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue <Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int i = pq.poll() -1;
        int j = pq.poll() -1;
        return i*j;
    }
}