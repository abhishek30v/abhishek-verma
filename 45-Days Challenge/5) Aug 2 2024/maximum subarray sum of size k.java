class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long maxsum = Integer.MIN_VALUE;
        long sum =0;
        int i=0,j=0;
        
        while(j<N){
            sum += (long) Arr.get(j);
            maxsum = Math.max(maxsum,sum);
            if(j-i+1==K){
                sum = sum - (long)Arr.get(i);
                i++;
                j++;
            }
           else{
            j++;
           }
        }
        return maxsum;
    }
}