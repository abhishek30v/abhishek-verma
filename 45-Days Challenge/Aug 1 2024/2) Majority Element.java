class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       //sort because after sorting the majority element will appear in n/2th index always
       Arrays.sort(nums);
       return nums[n/2];
    }
}