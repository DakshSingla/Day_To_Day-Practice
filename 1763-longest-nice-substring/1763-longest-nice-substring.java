class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "";
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                String sub = s.substring(i,j+1);
                if(help(sub)){
                    if(ans.length()<sub.length()){
                        ans=sub;
                    }
                }

            }
        }
        return ans;
    }
    public boolean help(String sub){
        Set<Character> set = new HashSet<>();
        for(char c:sub.toCharArray()){
            set.add(c);
        }
        for(char c:sub.toCharArray()){
            if(Character.isLowerCase(c)){
                if(!set.contains(Character.toUpperCase(c))){
                    return false;
                }
            }
            else
            if(!set.contains(Character.toLowerCase(c))){
                return false;
            }
        }
        return true;
    }
}