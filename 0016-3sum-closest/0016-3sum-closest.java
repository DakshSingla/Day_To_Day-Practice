class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        int smallNearest = Integer.MIN_VALUE;
        int largeNearest = Integer.MAX_VALUE;
        for(int i=0; i<n-2; i++){
          if(i>0 && nums[i]==nums[i-1]) continue;
          int st =i+1,  end =n-1;
          while(st<end){
            int sum = nums[i]+nums[st]+nums[end];
            if(sum==target){
                return sum;
            }
             else if(sum<target){
                smallNearest=Math.max(smallNearest,sum);
                st++;
            }  
            else if(sum>target){
                largeNearest = Math.min(largeNearest,sum);
                end--;
            }                                                                                                                                                                                                     
          }
        }
        if(smallNearest==Integer.MIN_VALUE) return largeNearest;
        else{int diff1 = target-smallNearest;
        int diff2 = largeNearest-target;
       if(diff1<diff2) return smallNearest;
       else return largeNearest; 
        }
    }
}