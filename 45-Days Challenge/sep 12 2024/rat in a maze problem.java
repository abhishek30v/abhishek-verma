class Solution {
    int n,m;
    int drow[] = {-1,0,1,0};
    int dcol[] = {0,-1,0,1};
    
    private void solve(int[][] mat,int r,int c, ArrayList<String> ans,String moves,boolean[][] vis){
        if(r == n-1 && c == m-1){
            ans.add(moves);
            return;
        }
        
        String dir = "ULDR";  //these are four directions up,left,down and right
        for(int i=0;i<4;i++){
            int nrow = r + drow[i];
            int ncol = c + dcol[i];
            
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m 
               && mat[nrow][ncol] == 1 && !vis[nrow][ncol]){
                   vis[nrow][ncol] = true;
                   solve(mat,nrow,ncol,ans,moves + dir.charAt(i),vis);
                   vis[nrow][ncol] = false;
               }
        }
    }
    
    public ArrayList<String> findPath(int[][] mat) {
       n= mat.length;
       m= mat[0].length;
       ArrayList<String> ans = new ArrayList<>();
       boolean[][] vis = new boolean[n][m];
       
       if(mat[0][0] == 1 && mat[n - 1][m - 1] == 1){
           vis[0][0] = true;
           solve(mat,0,0,ans,"",vis);
       }
       return ans;
    }
}