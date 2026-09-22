class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int n = s.length();
        // if(n==0) return false;
        // int i =0;
        // int j = n-1;
        // boolean flag = false;
        // while(i<n-1/2 && j>n-1/2){
        //     if(s.charAt(i)==s.charAt(j)){
        //         flag = true;
        //     }
        //     i++;
        //     j--;
        // }
        // return flag;
        for(int i = 0 ; i < n /2 ; i++){
            if(s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
        
    }
}
