class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int[] q :queries){
            int s = q[0];
            int sum = 0;
            int e = q[1];
            for(int i = s;i<=e;i++){
                sum += arr[i];
            }
            ans.add(sum);
        }
        return ans;
    }
}