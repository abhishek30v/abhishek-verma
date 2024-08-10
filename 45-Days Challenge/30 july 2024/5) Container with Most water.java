class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0,area = 0;;
        int n = height.length;
        int left =0,right = n-1;

        while(left<right){
           int width = right - left;
           int length = Math.min(height[left],height[right]);
           area = length * width;
           maxWater = Math.max(area,maxWater);
           if(height[left]<height[right]){
            left++;
           }else{
            right--;
           }
        }
return maxWater;
    }
}