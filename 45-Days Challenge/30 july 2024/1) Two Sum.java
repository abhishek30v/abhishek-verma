class Solution {
    public int[] twoSum(int[] nums, int target) {
    Pair[] pairs = new Pair[nums.length];
    for(int i=0;i<nums.length;i++){
        pairs[i] = new Pair(nums[i],i);
    }

    Arrays.sort(pairs,(a,b)->Integer.compare(a.value,b.value));

    int left =0;
    int right = nums.length-1;

    while(left<right){
        int sum = pairs[left].value+pairs[right].value;

        if(sum == target){
            return new int[] {pairs[left].index,pairs[right].index};
        }
        else if(sum<target){
            left++;
        }
        else{
            right--;
        }
    }
    return new int[] {};
    }
    

private class Pair{
int value ;
int index;

Pair(int value,int index){
    this.value=value;
    this.index=index;
}
}
}