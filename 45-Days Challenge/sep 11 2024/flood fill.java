class Solution {
    int n,m;
    int[][] directions = {{-1, 0},{0, -1},{1, 0},{0, 1}};   
    
    private void dfs(int[][] image, int r, int c, int color, boolean vis[][],int mcolor){
        vis[r][c] = true;
        image[r][c] = color;

        for(int[] dir : directions){
            int nrow = r + dir[0];
            int ncol = c + dir[1];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                && image[nrow][ncol] == mcolor && !vis[nrow][ncol]){
                    dfs(image,nrow,ncol,color,vis,mcolor);
                }
        }
    } 

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        n= image.length;
        m =image[0].length;
        boolean vis[][] = new boolean[n][m];
        int mcolor = image[sr][sc];

        if(!vis[sr][sc]){
            dfs(image,sr,sc,color,vis,mcolor);
        }
        return image;
    }
}