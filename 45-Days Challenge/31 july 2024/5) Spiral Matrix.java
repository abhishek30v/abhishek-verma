class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

          if (n == 0){
             return new ArrayList<>();
          }

        int startrow=0,startcol=0,endrow=n-1,endcol=m-1;
        List<Integer>ans = new ArrayList<>();
        
    while(startrow<=endrow && startcol<=endcol){      
        for(int j=startcol;j<=endcol;j++){
            ans.add(matrix[startrow][j]);
        }
        startrow++;

        for(int i=startrow;i<=endrow;i++){
            ans.add(matrix[i][endcol]);
        }
        endcol--;

        if(startrow<=endrow){
            for(int j=endcol;j>=startcol;j--){
                ans.add(matrix[endrow][j]);
            }
            endrow--;
        }

        if(startcol<=endcol){
            for(int i=endrow;i>=startrow;i--){
                ans.add(matrix[i][startcol]);
            }
            startcol++;
        }
    }
       return ans; 
    }
}