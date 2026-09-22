class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int n = strs.length;
        boolean[] temp = new boolean[strs.length];
        for(int i = 0;i<n;i++){
            List<String> cur = new ArrayList<>();
            if(temp[i]) continue;
            cur.add(strs[i]);
            temp[i] = true;
            for(int j = i+1;j<n;j++){
                    if(temp[j]) continue;
                if(check(strs[i],strs[j])){
                    cur.add(strs[j]);
                    temp[j] = true;
                }
            }
            ans.add(cur);
        }
        return ans;
    }
    public boolean check(String s1,String s2){
        if(s1.length()!= s2.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for(int c :freq){
            if(c!= 0){
                return false;
            }
        }
        return true;
    }
}
