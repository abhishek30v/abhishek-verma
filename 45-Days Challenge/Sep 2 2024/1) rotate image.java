class Solution {
    public void swap(int matrix[][],int i,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverseArray(int arr[]){
        int n = arr.length;
         for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
         }
    }

    public void rotate(int[][] matrix) {
         int n=matrix.length;
       //transpose matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
         }
         
         //reverse all rows now
         for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
         }
        
    }
}