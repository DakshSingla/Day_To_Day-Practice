class Solution {
    public double myPow(double x, int n) {
        return doo(x, (long)n);
    }
    public double doo(double x, long n){
        if(n== 0) return 1;
        if(n<0) return 1.0/doo(x,-n);
        if(n%2 == 1) return x*doo(x*x,(n-1)/2);
        else return doo(x*x,n/2);
    }
}