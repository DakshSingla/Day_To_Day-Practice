class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int lap = arr.length/3;
        ArrayList<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int num :map.keySet()) {
            if (map.get(num)> lap) {
                ans.add(num);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}