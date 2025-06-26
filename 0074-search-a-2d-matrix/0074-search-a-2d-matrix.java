class Solution{
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int r=0,c=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]==target){
                    return true;
                }
                 else if(matrix[i][j]<=target){
                   r++;
               }
               else {}
                   c--;
               }
            }  
     return false;
    }
}
