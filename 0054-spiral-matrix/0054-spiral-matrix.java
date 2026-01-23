class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom = rows-1;
        int right = cols-1;
        while(top<=bottom && left<=right){
            for(int i = left;i<=right;i++){
                ans.add(matrix[top][i]); 
            }top++;
            for(int i = top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }right--;
            if(top<=bottom)
            {
                for(int i = right;i>=left;i--){
                ans.add(matrix[bottom][i]);
                }bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }left++;
            }
        }
        return ans;        
    }
}