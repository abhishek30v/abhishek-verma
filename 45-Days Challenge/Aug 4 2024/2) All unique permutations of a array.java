class Solution {
    static void recursivePerms(ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds ,Set<ArrayList<Integer>> uniqueDs,int freq[],int n){
        if(ds.size() == n){
            if(!uniqueDs.contains(ds)){
                ans.add(new ArrayList<>(ds));
                uniqueDs.add(new ArrayList<>(ds));
            }
            return;
        }
        
        for(int i=0;i<n;i++){
            if(freq[i] == 0){
                freq[i] =1;
                ds.add(arr.get(i));
                recursivePerms(arr,ans,ds,uniqueDs,freq,n);
                freq[i] =0;
                ds.remove(ds.size()-1);
            }
        }
    }
    
    
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        Set<ArrayList<Integer>> uniqueDs = new HashSet<>();
        int freq[] = new int[n];
        for(int i=0;i<n;i++) freq[i] =0;
        Collections.sort(arr);
        recursivePerms(arr,ans,ds,uniqueDs,freq,n);
        return ans;
        
    }
};