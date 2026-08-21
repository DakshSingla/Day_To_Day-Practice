import java.math.*;
class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        // int n = s1.length();
        // int m = s2.length();
        
        // for(int i = 0;i<s1.length();i++){
            
        // }
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        BigInteger mul = num1.multiply(num2);
        return mul.toString();
    }
}