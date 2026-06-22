class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] arr= new char[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(arr[i],'.');
        }
        fill(0,arr);
        return ans;
    }
    public void fill(int row , char[][] arr){
        if(row == arr.length){
            save(arr);
            return;
        }
        for(int col=0; col<arr.length; col++){
            if(check( row, col,arr)){
                arr[row][col] = 'Q';
                fill(row + 1, arr);
                arr[row][col] = '.';
            }
        }
    }
    public boolean check(int row, int col, char[][] arr){
        for(int i = 0;i<row;i++){
            if(arr[i][col] == 'Q') return false;
        }
        for(int i = row,j = col;i>=0&&j>=0;i--,j--){
            if(arr[i][j] == 'Q') return false;
        }
        for(int i = row,j = col;i>=0&&j<arr.length;i--,j++){
            if(arr[i][j] == 'Q') return false;
        }
        return true;
    }
    public void save(char[][] arr){
        List<String> l = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            l.add(new String(arr[i]));
        }
        ans.add(l);
    }
}