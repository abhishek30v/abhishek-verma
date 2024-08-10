class Solution {
    public static long[] productExceptSelf(int nums[]) {
        int n = nums.length;
        long[] ans = new long[n];
      
        long prefixproduct=1;
        for(int i=0;i<n;i++){
            ans[i] = prefixproduct;
            prefixproduct *= nums[i]; 
        }
        
        long suffixproduct=1;
        for(int i=n-1;i>=0;i--){
            ans[i] *= suffixproduct;
            suffixproduct *= nums[i];
        }
        return ans;
    }
}
