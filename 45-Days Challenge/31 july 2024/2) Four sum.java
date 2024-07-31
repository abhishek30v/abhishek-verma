class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n= nums.length;
        Arrays.sort(nums);
        Set<List<Integer>>ans= new HashSet<>();
      
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int left = j+1;
                int right = n-1;
                while(left<right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                }
            }
        }
return new ArrayList<>(ans);
    }
}