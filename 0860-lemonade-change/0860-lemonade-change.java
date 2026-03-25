class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int a = 0,b=0;
        for(int bill:bills){
            if(bill == 5) a++;
            else if(bill == 10){
                if(a==0) return false;
                a--;
                b++;
            }
            else{
                if(a>0 && b>0){
                    a--;
                    b--;
                }
                else if(a>=3){
                    a -=3;
                }
                else return false;
            }
        }
        return true;
    }
}