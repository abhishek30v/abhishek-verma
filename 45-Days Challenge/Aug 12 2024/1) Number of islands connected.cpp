class Solution {
  public:
  bool isSafe(vector<vector<char>>& grid, int r, int c,vector<vector<bool>>& visited) {
        int row = grid.size();
        int col = grid[0].size();
        
         return (r >= 0) && (r < row) && (c >= 0) && (c < col) && 
                               (grid[r][c]=='1' && !visited[r][c]);
  }
  
    void dfs(vector<vector<char>>& grid,int r,int c,vector<vector<bool>>& visited){
    vector<int> rNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
    vector<int> cNbr = { -1, 0, 1, -1, 1, -1, 0, 1 };
    visited[r][c] = true;
    for (int k = 0; k < 8; ++k) {
        int newR = r + rNbr[k];
        int newC = c + cNbr[k];
        if (isSafe(grid, newR, newC, visited)) {
            dfs(grid, newR, newC, visited);
        }
    }
}
    
    int numIslands(vector<vector<char>>& grid) {
         int row = grid.size();
         if(row == 0){
             return 0;
         }
         
        int col = grid[0].size();
        vector<vector<bool>> visited(row,vector<bool>(col,false));
        int count =0;
        
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    ++count;
                }
            }
        }
        return count;
    }
};
