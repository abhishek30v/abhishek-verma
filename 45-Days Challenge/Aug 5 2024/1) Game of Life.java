class Solution {
    public void set(int i,int j,int n,int m,int[][] ans,int[][] board){
        int liveneighbours =0;
        for(int row = -1 ;row<=1;row++){
            for(int col =-1;col<=1;col++){
                if(row == 0 && col == 0)continue;
                int newrow = i + row;
                int newcol = j + col;
                if(newrow>= 0 && newrow < n && newcol>=0 && newcol < m && board[newrow][newcol] == 1){           
                        liveneighbours++;
                }
            }
        }

        if(board[i][j] == 1){
            if(liveneighbours < 2 || liveneighbours > 3){
                ans[i][j] = 0;
            }else
                ans[i][j] = 1;
        }
        else if(board[i][j] == 0){
            if(liveneighbours == 3){
                ans[i][j] = 1;
             }
             else
                ans[i][j] = 0; 
        }
    }

    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int ans[][] = new int[n][m];

        for(int i=0;i<n;i++)  {
            for(int j=0;j<m;j++){
                set(i,j,n,m,ans,board);
            }
        }
        //copy the elements into original one.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j] = ans[i][j];
            }
        }
    }
}