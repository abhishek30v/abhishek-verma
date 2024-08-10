class Solution {
    public int largestRectangleArea(int[] heights) {
       int n = heights.length;
       int leftsmaller[] = new int[n];
       int rightsmaller[] = new int[n];
       Stack<Integer>st = new Stack<>();

       for(int i=0;i<n;i++){
           while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
               st.pop();
           }
        if(st.isEmpty()){
           leftsmaller[i] = 0;
        }else
           leftsmaller[i] = st.peek()+1;
           st.push(i);
       }

        st.clear();

        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
               st.pop();
           }
        if(st.isEmpty()){
           rightsmaller[i] = n-1;
        }else
           rightsmaller[i] = st.peek()-1;
           st.push(i);
       }

//calculate maximum
int maxi = Integer.MIN_VALUE;
for(int i=0;i<n;i++){
   int height = heights[i];
   int width = (rightsmaller[i] - leftsmaller[i])+1;  
   int area = height*width;
   maxi = Math.max(area,maxi);
}
return maxi;
}
}
