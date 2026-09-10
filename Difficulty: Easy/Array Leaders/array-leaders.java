class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = arr[arr.length-1];
        ans.add(maxi);
        
        for(int i =arr.length-2;i>=0;i--){
            if(arr[i]>=maxi){
                maxi = arr[i];
                ans.add(maxi);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
