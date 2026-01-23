class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // int r= 0,c=0;
        // while(r<=rows-1){
        //     if(matrix[r][c]<=target && target>=matrix[rows-1][cols-1]){
        //         for(int j = 0;j<cols;j++){
        //             if(matrix[r][j]== target){
        //                 return true;
        //             }
        //         }
        //     }
        //     else r++;
        // }
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ;j < cols ; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }
}