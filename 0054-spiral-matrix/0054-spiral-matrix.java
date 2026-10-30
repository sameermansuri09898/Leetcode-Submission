class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int st_row = 0;
        int end_row = m-1;
        int st_col = 0;
        int end_col = n-1;

        List<Integer> ans = new ArrayList<>();
        
        while(st_row<=end_row && st_col<=end_col){
            //top head
            for(int i = st_col;i<=end_col;i++){
                ans.add(matrix[st_row][i]);
            }
            //right
            for(int j = st_row+1;j<=end_row;j++){
                ans.add(matrix[j][end_col]);
            }
            //bottom

            if(st_row<end_row){
            for(int j = end_col-1;j>=st_col;j--){
                ans.add(matrix[end_row][j]);
            }
            }
            //left
            if(st_col<end_col){
            for(int j = end_row-1;j>st_row;j--){
                ans.add(matrix[j][st_col]);
            }
            }

            st_row++;
            end_row--;
            st_col++;
            end_col--;

        }
        return ans;
    }
}