class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    //     String ans = "";
    //     for( int i = 0;i<num.length();i++){
    //         String temp =""+ num.charAt(i);
    //         if((num.charAt(i) - '0')%2 != 0){
    //                if(Integer.parseInt(temp) > Integer.parseInt(ans){
    //                     ans = temp;
    //                 }
    //             }
    //         for(int j = i+1;j<num.length();j++){
    //             temp = temp + num.charAt(j);
    //             if((num.charAt(j) - '0')%2 != 0){
    //                if(Integer.parseInt(temp) > Integer.parseInt(ans)){
    //                     ans = temp;
    //                 }
    //             }
    //         }
    //     }
    //     return ans;

    //    String ans = ""; 
    //    for( int i = 0;i<num.length();i++)
    //    {
    //      String temp = "";
    //       temp = num[i]-'a';
    //        for(int j = i+1;j<num.length();j++)
    //        {
    //          if((num[j]-'a')%2 != 0)
    //          {
    //              ans = Math.max(ans,temp);
    //          } 
    //          temp = temp + num.charAt(j);
    //      }
    //      } return ans;
    }
}