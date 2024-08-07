class Solution {
    public void paranthesisUtils(int n,int open,int close,String str,List<String> ans){
        if(n*2 == str.length()){
            ans.add(str);
            return;
    }

    if(open < n){
        paranthesisUtils(n,open+1,close,str+'(',ans);
    }
    if(close<open){
        paranthesisUtils(n,open,close+1,str+')',ans);
    }
 }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans =new ArrayList<String>();
        paranthesisUtils(n,0,0,"",ans);
        return ans;
    }
}
