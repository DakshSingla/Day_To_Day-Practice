
class Solution {
    public boolean palindrome(String s){
        String str = s;
        String rev = new StringBuilder(s).reverse().toString();
        return str.equals(rev);
    }
    public void getall(String s, List<String> sub,List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(sub));
            return;
        }
        for(int i = 0;i<s.length();i++){
            String part = s.substring(0,i+1);
            if(palindrome(part)){
                sub.add(part);
                getall(s.substring(i+1),sub,ans);
                sub.remove(sub.size()-1); 
            }
            
        }
    }
    public List<List<String>> partition(String s) {
        // code here
        List<List<String>> ans = new ArrayList<>();
        List<String> subs = new ArrayList<>();
        getall(s,subs,ans);
        return ans;
    }
}