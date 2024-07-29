class Solution {
public:
    void swap(int *a,int *b){
        int temp = *a;
        *a = *b;
        *b = temp;
    } 

    void sortColors(vector<int>& nums) {
        int n= nums.size();
        int left=0,mid=0,right=n-1;

        while(mid<=right){
            if(nums[mid] == 0){
                swap(&nums[left],&nums[mid]);
                left++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(&nums[mid],&nums[right]);
                right--;
            }
        }
    }
};