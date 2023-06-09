class Solution {
    public int minFallingPathSum(int[][] A) {
        int[][] dpmin = new int[A.length][A[0].length];
        
        for(int i = 0;i < A.length; ++i) {
            for(int j = 0; j < A[0].length; ++j) {
                if(i == 0) {
                    dpmin[i][j] = A[i][j];
                }
                else {
                    if(j == 0) {
                        dpmin[i][j] = Math.min(dpmin[i-1][j], dpmin[i-1][j+1]) + A[i][j];
                    }
                    else if(j == A[0].length-1) {
                        dpmin[i][j] = Math.min(dpmin[i-1][j-1], dpmin[i-1][j]) + A[i][j];
                    }
                    else {
                        dpmin[i][j] = Math.min(dpmin[i-1][j+1], Math.min(dpmin[i-1][j-1], dpmin[i-1][j])) + A[i][j];
                    }
                }
                
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < A[0].length; ++j) {
            min = Math.min(min, dpmin[A.length-1][j]);
        }
        
        return min;
    }
}
