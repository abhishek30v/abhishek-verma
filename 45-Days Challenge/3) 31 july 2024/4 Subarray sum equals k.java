class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int prefixsum=0;
        int count =0;
        map.put(0,1);
 
        for(int i=0;i<n;i++){
            prefixsum+= nums[i];
            int diff = prefixsum-k;

            if(map.containsKey(diff)){
                  count+= map.get(diff);
            }

            if(map.containsKey(prefixsum)){
                  map.put(prefixsum , map.get(prefixsum)+1);
            }else{
                map.put(prefixsum,1);
            }
        }
        return count;
    }
}