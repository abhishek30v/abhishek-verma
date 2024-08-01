class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int index = nums[0];

        for(int i=0;i<=index;i++){
            if(index>= n-1){
                return true;
            }
              index = Math.max(index,i+nums[i]);
        }
return false;
    }
}