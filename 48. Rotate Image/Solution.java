class Solution {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length-1;
        int top =0;
        int bottom = matrix.length-1;
        while(left<right){
            int step = right - left;
            for(int i =0;i<step;i++){
                int temp = matrix[top][left+i];
                matrix[top][left+i]=matrix[bottom-i][left];
                matrix[bottom-i][left]=matrix[bottom][right-i];
                matrix[bottom][right-i]=matrix[top+i][right];
                matrix[top+i][right]=temp;
            }
            left++;
            right--;
            bottom--;
            top++;
        }
    }
}