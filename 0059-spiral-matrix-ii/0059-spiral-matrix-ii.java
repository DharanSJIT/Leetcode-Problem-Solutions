class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int top = 0;
        int left = 0;
        int bottom =mat.length-1;
        int right =mat[0].length-1;
        int temp=1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                mat[top][i]=temp;
                temp++;
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                mat[j][right]=temp;
                temp++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    mat[bottom][i]=temp;
                temp++;
                }

            }
            bottom--;
            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                   mat[j][left]=temp;
                temp++;
                }
            }
            left++;
        }
        return mat;

    }
}