class Solution
{
    public static int calculate(char ch,int a,int b){
        int res=0;
        switch(ch){
            case '+':res=a+b;
                     break;
            case '-':res=a-b;
                     break;
            case '*':res=a*b;
                     break;
            case '/':res=a/b;
                     break;  
        }
        return res;
    }
    
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer>st = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
        if(Character.isDigit(ch)){
            st.push(ch - '0');
        }
        else{
            int b = st.pop();
            int a = st.pop();
            int result = calculate(S.charAt(i),a,b);
            st.push(result);
            }
        }
        return st.peek();
    }
}