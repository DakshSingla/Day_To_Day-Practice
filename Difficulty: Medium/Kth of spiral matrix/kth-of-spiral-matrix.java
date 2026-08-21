class Solution {
    public int findK(int[][] mat, int k) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int top = 0;
        int bottom = n;
        int left = 0;
        int right = m;
        int count = 1;
        while (top < bottom && left < right){
            for(int i = left;i<right;i++){
                if(k==count){
                    return mat[top][i];
                }
                count++;
            }top++;
            for(int i= top;i<bottom;i++){
                if(k==count){
                    return mat[i][right-1];
                }
                count++;
            }right--;
            if(top<bottom){
                for(int i = right-1;i>=left;i--){
                    if(k==count){
                        return mat[bottom-1][i];
                    }
                    count++;
                }bottom--;
            }
            if(left<right){
                for(int i = bottom-1;i>=top;i--){
                    if(k==count){
                        return mat[i][left];
                    }
                    count++;
                }left++;
            }
        
        }
        return -1;
    }
}