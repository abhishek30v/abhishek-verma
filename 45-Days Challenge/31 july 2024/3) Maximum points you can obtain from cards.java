class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length;
       int leftsum=0,rightsum=0, maxsum =0;

        for(int i=0;i<k;i++){
            leftsum+= cardPoints[i];
        }
        maxsum = leftsum;
        int rightindex = n-1;

        for(int i=k-1;i>=0;i--){
            leftsum = leftsum - cardPoints[i];
            rightsum += cardPoints[rightindex];
            rightindex--;
            maxsum = Math.max(maxsum, leftsum + rightsum);
        }
        return maxsum;
    }
}