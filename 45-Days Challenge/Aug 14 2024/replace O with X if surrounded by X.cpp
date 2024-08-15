class Solution{
public:
    void floodfillutils(int i,int j,vector<vector<char>>&mat,char prev_val,char new_val,int n,int m){
        if(i<0 || i>=n || j<0 || j>=m){
            return;
        }
        
        if(mat[i][j] != prev_val){
            return;
        }
        
        mat[i][j] = new_val;
        
        //recursions in 4 directions->
        floodfillutils(i+1,j,mat,prev_val,new_val,n,m);  //south
        floodfillutils(i,j+1,mat,prev_val,new_val,n,m);  //east
        floodfillutils(i-1,j,mat,prev_val,new_val,n,m);  //north
        floodfillutils(i,j-1,mat,prev_val,new_val,n,m);  //west
    }


    vector<vector<char>> fill(int n, int m, vector<vector<char>> mat)
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 'O'){
                    mat[i][j] ='-';
                }
            }
        }
        //left  side
        for(int i=0;i<n;i++){
            if(mat[i][0] == '-'){
                floodfillutils(i,0,mat,'-','O',n,m);
            }
        }
        //right side
        for(int i=0;i<n;i++){
            if(mat[i][m-1] == '-'){
                floodfillutils(i,m-1,mat,'-','O',n,m);
            }
        }
        //top side
        for(int i=0;i<m;i++){
            if(mat[0][i] == '-'){
                floodfillutils(0,i,mat,'-','O',n,m);
            }
        }
        //bottom side
        for(int i=0;i<m;i++){
            if(mat[n-1][i] == '-'){
                floodfillutils(n-1,i,mat,'-','O',n,m);
            }
        }
        
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == '-'){
                    mat[i][j] ='X';
                }
            }
        }
     return mat;
    }
};