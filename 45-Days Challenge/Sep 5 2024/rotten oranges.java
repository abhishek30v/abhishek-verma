class Pair{
    int row;
    int col;
    int tm;
    Pair(int row,int col,int tm){
        this.row = row;
        this.col = col;
        this.tm =tm;
    }
}

class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        int freshcount =0;
        Queue<Pair> q = new LinkedList<>();
        int vis[][] = new int[n][m]; 
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    vis[i][j] = 2;
                    q.add(new Pair(i,j,0));
                }
                else{
                    vis[i][j] = 0;
                }
                
                if(grid[i][j] == 1){
                    freshcount++;
                }
            }
        }
        
        int max_time =0,cnt=0;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            q.remove();
            max_time = Math.max(max_time,t);
            
            for(int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                
                if( nrow>=0 && nrow<n && ncol>=0 && ncol<m
                   && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1)
                    {
                        q.add(new Pair(nrow,ncol,t+1));
                        vis[nrow][ncol] = 2;
                        cnt++;
                    }
            }
         }
        if(freshcount!=cnt){
            return -1;
        }
        return max_time;
    }
}