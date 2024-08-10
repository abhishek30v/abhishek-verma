class Solution {
    public int subarraysDivByK(int[] nums, int k) {
    int n = nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int prefixsum=0,count=0;

    for(int i=0;i<n;i++){
        prefixsum+= nums[i];
        int remainder = (prefixsum % k);

       if (remainder < 0) {
                remainder += k;
        }
        
        if(map.containsKey(remainder)){
            count += map.get(remainder);
        }

        if(map.containsKey(remainder)){
            map.put(remainder,map.get(remainder)+1);
        }else{
            map.put(remainder,1);
        }
    }
    return count;
    }
}