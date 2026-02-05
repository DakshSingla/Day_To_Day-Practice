class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int j =0;
        List<Integer> sann = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        while(j<nums.length){
            while(!dq.isEmpty()&& nums[dq.peekLast()]<=nums[j]){
                dq.pollLast();
            }
            dq.addLast(j);
            if(j-i+1<k){
                j++;
            }else{
                sann.add(nums[dq.peekFirst()]);
                if(dq.peekFirst()==i){
                    dq.pollFirst();
                }
                i++;
                j++;
            }
        }
        int[] result = new int[sann.size()];

        for (int a = 0; a < sann.size(); a++) {
            result[a] = sann.get(a);
        }
        return result;
    }
}