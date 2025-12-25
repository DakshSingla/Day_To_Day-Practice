class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        
        for(int r = 0;r<rows;r++){
            int cs = 0;
            int[] temp = new int[cols];
            for(int ce = cols-1;ce>=0;ce--){
                if(image[r][ce] == 1){
                    temp[cs] =0;
                    
                }
                else{
                    temp[cs] = 1;
                }
                cs++;
            }
            image[r] = temp;
           
        }
        return image;
    }
}