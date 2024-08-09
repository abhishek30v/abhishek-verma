class Solution {
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        int i=n-1;
        int j=m-1;
        int carry=0;
        int sum=0;
        StringBuilder sb = new StringBuilder();

        while(i>=0 || j>=0 ){
            if(i>=0){
            int first_digit = a.charAt(i) - '0';
            carry += first_digit;
            }
            if(j>=0){
            int second_digit = b.charAt(j) - '0';
            carry += second_digit;
            }
            sum = carry;
            int val = sum%2;
            sb.append(val);
            carry = carry/2;
            i--;
            j--;
        }
        if(carry == 1)
        sb.append(carry);
        return sb.reverse().toString();
    }
}