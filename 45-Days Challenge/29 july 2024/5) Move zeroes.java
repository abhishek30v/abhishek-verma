class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i] != 0){
             temp.add(i);   
            }
        }

        for(int i=0;i<temp.size();i++){
            nums[i] = nums[temp.get(i)];
        } 

       int nonzeroes = temp.size();

        for(int i=nonzeroes;i<n;i++){
            nums[i] = 0;
        }
     }
}
