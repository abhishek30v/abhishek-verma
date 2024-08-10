class Solution {
    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    } 

    public boolean validPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;

        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
               left++;
               right--;
            }
            else{
                if(isPalindrome(s,left+1,right)){
                    return true;
                }
                if(isPalindrome(s,left,right-1)){
                    return true;
                }   
                return false;
            }
        }
        return true;
    }
}