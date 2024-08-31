class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int n = nums2.length;
         HashMap<Integer,Integer>map = new HashMap<>();
         Stack<Integer>st = new Stack<>();
         int nge[] = new int[n];

         for(int i=0;i<n;i++){
            map.put(nums2[i],i);
         }

         for(int i=n-1;i>=0;i--){
            if(!st.isEmpty()){
                if(nums2[i] >= st.peek()){
                while(!st.isEmpty() && nums2[i] >= st.peek()){
                     st.pop();
                }
                }
            }
                if(st.isEmpty()){
                    nge[i] = -1;
                }else{
                    nge[i] = st.peek();
                }
            st.add(nums2[i]);
         }

        for(int i=0;i<nums1.length;i++){
           int idx = map.get(nums1[i]); 
           nums1[i] = nge[idx];    
        }
    return nums1;
    }
}