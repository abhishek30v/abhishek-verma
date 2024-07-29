class Solution {
    public int findDuplicate(int[] nums) {
        int left=0,right=1;
        Arrays.sort(nums);

     while(left<nums.length){
          if(nums[left] == nums[right]){
            return nums[left];
          }
          else{
            left++;
            right++;
          }
     }
     return -1;
}
}