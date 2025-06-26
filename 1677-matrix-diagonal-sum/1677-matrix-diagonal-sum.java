class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length,sum1=0,sum2=0;
        if(n==1){
            return mat[0][0];
        }
        for(int i=0;i<n;i++){
            sum1+=mat[i][i];
        }
        for(int i=0;i<n;i++){
            if(i==(n-i-1))
               continue;
            
            sum2+=mat[i][n-i-1];
        }
        return sum1+sum2;
        }
    }
