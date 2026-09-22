class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i = 0;
        while(k-- > 0){
                int maxv = 0;
                int maxk = 0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>maxv){
                    maxv = entry.getValue();
                    maxk = entry.getKey();
                }
            }
            ans[i] = maxk;
            i++;
            map.remove(maxk);
        }
        
        return ans;

    }
}
