class Solution {
    public int countTriples(int n) {
        int count= 0;
        for(int i = 1;i<=n;i++){
            for(int j = i+1;j<=n;j++){
                if(j==i) continue;
                int a  = (i*i)+(j*j);
                int r = (int)Math.sqrt(a);
                if(r<=n && r*r == a){
                    
                    count++;
                }
            }
        }
        return count*2;
    }
}