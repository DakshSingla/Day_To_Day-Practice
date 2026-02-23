class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        if(s.length()!= t.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!map.containsKey(a)){
                if(!map.containsValue(b)){
                    map.put(a,b);
                }
                else
                    return false;
            }
            else { 
                char mapchar=map.get(a);
                if (mapchar != b) 
                return false; 
            }

        }
        return true;
    }
}