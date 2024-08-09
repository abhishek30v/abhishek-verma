class Solution {
    public int calculate(String s) {
        int n = s.length();
        int i=0;
        Stack<Integer> st = new Stack<>();
        char sign= '+';

        while(i<n){
            char ch = s.charAt(i);
            if(ch == ' '){
                i++;
                continue;
            }

            if(Character.isDigit(ch)){
                int val=0;
                while(i<n && Character.isDigit(s.charAt(i))){
                   val = val * 10 + (s.charAt(i)-'0');
                   i++;
                }

                if(sign == '+'){
                    st.push(val);
                }
                else if(sign == '-'){
                    st.push(-val);
                }
                else if(sign == '*'){
                    st.push(st.pop()*val);
                }
                else if(sign == '/'){
                    st.push(st.pop() / val);
                }
                continue;
            }
           
            sign = s.charAt(i);
            i++;
     }
              
        int sum =0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}