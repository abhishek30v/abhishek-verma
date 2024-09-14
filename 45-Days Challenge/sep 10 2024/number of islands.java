class Pair{
    int first;
    int second;
   public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public void bfs(char[][]grid,int row,int col,int vis[][]){
        vis[row][col] =1;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));

       int[] drow = {0,-1,0,+1};
       int[] dcol = {-1,0,+1,0};

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            q.remove();
        
            for(int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];

                if(nrow>=0 && nrow<n && ncol >=0 && ncol < m 
                   && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1'){
                       q.add(new Pair(nrow,ncol));
                       vis[nrow][ncol] = 1;
                   }
            }
        } 
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count =0;
        int vis[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(vis[i][j] == 0 && grid[i][j] == '1'){
                    bfs(grid,i,j,vis);
                    count++;
               }
            }
        }
        return count;
    }
}