class Solution {
    public boolean backtrack(char[][]board,String word ,int i,int j,boolean[][] visited,int index){
       if(word.length()-1 == index){
        return true;
       } 
        visited[i][j] =true;

       if(i>0 && board[i-1][j] == word.charAt(index+1) && !visited[i-1][j] && backtrack(board,word,i-1,j,visited,index+1)) return true;
       if(j>0 && board[i][j-1] == word.charAt(index+1) && !visited[i][j-1] && backtrack(board,word,i,j-1,visited,index+1)) return true;
       if(i<board.length-1 && board[i+1][j] == word.charAt(index+1) && !visited[i+1][j] && backtrack(board,word,i+1,j,visited,index+1)) return true;
       if(j<board[0].length-1 && board[i][j+1] == word.charAt(index+1) && !visited[i][j+1] && backtrack(board,word,i,j+1,visited,index+1)) return true;

       visited[i][j] = false;
       return false;
    }

    public boolean exist(char[][] board, String word) {
        int n= board.length;
        int m= board[0].length;
        boolean visited[][]= new boolean[n][m];
      
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(board[i][j] == word.charAt(0) && backtrack(board,word,i,j,visited,0)){
                   return true;
               }
            }
        }
        return false;
    }

}