class Solution {
    public String minWindow(String s, String t) {
        String ans = "";
        int[] freq = new int[128];
        Map<Character,Integer> map = new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int i = 0;
        int count = t.length();
        int min = Integer.MAX_VALUE;
        int start = 0;
        for(int r = i;r<s.length();r++){
            char c = s.charAt(r);
            if(map.getOrDefault(c,0)>0){
                count--;
            }
            map.put(c,map.getOrDefault(c,0)-1);
            while(count ==0){
                if(r-i+1 < min){
                    min = r-i+1;
                    start = i;
                }
                char left = s.charAt(i);
                map.put(left, map.getOrDefault(left,0)+1);
                if(map.get(left)>0){
                    count++;
                }
                i++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}