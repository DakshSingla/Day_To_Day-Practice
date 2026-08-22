class Solution {
    public int kthElement(int a[], int b[], int k) {
        int[] c = new int[a.length+b.length];
        for(int i = 0;i<a.length; i++) {
            c[i] = a[i];
        }
        for(int i = 0;i<b.length;i++) {
            c[a.length + i] = b[i];
        }
        Arrays.sort(c);
        return c[k - 1];
        
    }
}