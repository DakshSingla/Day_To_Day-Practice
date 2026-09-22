class Solution {
    public int[] twoSum(int[] num, int t) {
        int l = 0;
        int r = num.length-1;
        while(l<r){
            int sum = num[l]+num[r];
            if(sum>t){
                r--;
            }
            else if(sum<t){
                l++;
            }else
                return new int[]{l+1,r+1};

        }
        return new int[]{-1,-1};
    }
}
