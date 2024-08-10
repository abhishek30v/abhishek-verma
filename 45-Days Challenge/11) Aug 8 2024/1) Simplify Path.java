class Solution {
    public String simplifyPath(String path) {
        String[] newPath = path.split("/");
        Stack<String>st = new Stack<>();

        for(int i=0;i<newPath.length;i++){
            if(newPath[i].equals(".") || newPath[i].equals("")){
                continue;
            }
            if(!newPath[i].equals("..")){
                st.push(newPath[i]);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }

       if(st.isEmpty()){
        return "/";
       }
 
        String ans = "";
        while(!st.isEmpty()){
            String s = st.pop();
            ans ="/" + s + ans;
        }
        return ans;
    }
}