class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product1 =1,product2 =1;
        int n = nums.length;

        for(int i=n-1;i>n-4;i--){
               product1 = product1 * nums[i];// product of largest 3 numbers ,will be present at last indexes.
        }
        for(int i=0;i<2;i++){
            product2 = product2 * nums[i];  // product of smallest two negative numbers will give very largest positive number.
        }
        product2 = product2*nums[n-1]; // as we have to multiply 3 numbers,then multiply it with the largest number in array itself which will be at last.
         
         int maxproduct = Integer.MIN_VALUE;
         maxproduct = Math.max(product1,product2); 

        return maxproduct;
    }
}