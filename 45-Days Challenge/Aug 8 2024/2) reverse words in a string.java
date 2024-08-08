class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split(" ");
        
        int j = arr.length-1;
        StringBuilder ans = new StringBuilder();
        while(j>=0){
           String word = arr[j];
           if(!word.equals("")){
             ans.append(word);
           }
           if(j!=0 ){
            ans.append(" ");
           }
           j--;
        }
        
        String finalans="";              //if want to directly initialize with first character -->  String finalans = String.valueOf(ans.charAt(0));
        finalans += ans.charAt(0);
        int left=0;
        int right = 1;
        for(int i=0;right<ans.length();i++){
            if(ans.charAt(left) == ' ' && ans.charAt(right) == ' '){
                  left++;
                  right++;
                  continue;
            }
            finalans+= ans.charAt(right);
            left++;
            right++;
        }
        return finalans;
    }
}