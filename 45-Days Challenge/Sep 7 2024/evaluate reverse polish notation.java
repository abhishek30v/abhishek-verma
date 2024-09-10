class Solution {
    public int operate(int a,int b,String token){
        switch(token){
            case "+" : return a+b;
            case "-" : return a-b;
            case "*" : return a * b;
            case "/" : return a/b;
            default : throw new IllegalArgumentException("Invalid");
        }
    }   

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int result =0;
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = st.peek();
                st.pop();
                int a = st.peek();
                st.pop();
                result = operate(a,b,token);
                st.push(result);
            }else{
                st.push(Integer.parseInt(token));
            }
        }   
 return st.peek();
   }
}