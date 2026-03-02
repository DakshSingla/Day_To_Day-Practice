class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> list =
        new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)-> b.getValue()-a.getValue());
        StringBuilder st = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list){
            char c = entry.getKey();
            int idx = entry.getValue();
            for(int i = 0;i<idx;i++){
                st.append(c);
            }
        }
        return st.toString();
    }

}