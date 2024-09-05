class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int res=0;

        for(int ele : arr){
            while(stack.peek() <= ele){
                int mid = stack.pop();
                res += mid * Math.min(stack.peek(),ele);
            }
            stack.push(ele);
        }

        while(stack.size() > 2){
            int val = stack.pop();
            res+= val * stack.peek();
        }
        return res;
    }
}