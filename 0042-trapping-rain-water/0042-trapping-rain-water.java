class Solution {
    public int trap(int[] height) {
        int s=0;
        int e= height.length-1;
        int left=height[s];
        int right=height[e];
        int ans=0;
        while(s<e){
            if(left<right){
                s++;
                left= Math.max(left,height[s]);
                ans+=left-height[s];
            }else{
                e--;
                right= Math.max(right,height[e]);
                ans+=right-height[e];
            }
        }return ans;
            
        
    }
}