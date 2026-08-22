class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == x){
                ans.add(i);
                break;
            }
        }
        if(ans.size() == 0) {
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        for(int i = ans.get(0);i<arr.length;i++){
            if(arr[i] != x){
                ans.add(i-1);
                return ans;
            }
        }
        ans.add(arr.length-1);
        return ans;
    }
}
