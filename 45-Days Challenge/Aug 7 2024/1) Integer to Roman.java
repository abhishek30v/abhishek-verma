class Solution {
    public String intToRoman(int num) {
        int[] val = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] sym = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder ans = new StringBuilder();         
        int i = val.length-1;

        while(num>0 && i>=0){
            if(num >= val[i]){
                num = num -val[i];
                ans.append(sym[i]);
            }else{
                i--;
            }
        }
        return ans.toString();
    }
}