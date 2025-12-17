class Solution {
    List<String> ans = new LinkedList<>();
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        if(n==0) return ans;
        dfs(new StringBuilder(), s, 4);
        return ans;
    }
    private void dfs(StringBuilder str, String s, int section){
        if(s.length() ==0 && section == 0){
            ans.add(str.substring(0, str.length()-1).toString());
            return;
        }
        if(s.length() > 0 && section== 0) return;
        if(s.length()==0&& section>0) return;
        StringBuilder sb = new StringBuilder();
        int min = Math.min(s.length(),3);
        for(int i = 0;i<min;i++){
            sb.append(s.charAt(i));
            int val = Integer.parseInt(sb.toString());
            if(sb.length() == 2 && val<10) continue;
            if(sb.length() == 3 && val<100) continue;
            if(sb.length() == 3 && val>255) continue;
            StringBuilder temp = new StringBuilder(str);
            str.append(sb.toString());
            str.append(".");

            dfs(str,s.substring(i+1,s.length()),section-1);
            str = temp;

        }
    }
}