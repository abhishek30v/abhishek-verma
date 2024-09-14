class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(adj,vis,ans,i);
            }
        }
        return ans;
    }
    
    
    private void dfs(ArrayList<ArrayList<Integer>> adj,boolean vis[],ArrayList<Integer> ans,int curr){
        vis[curr] = true;
        ans.add(curr);
        
        for(int neighbour : adj.get(curr)){
            if(!vis[neighbour]){
                dfs(adj,vis,ans,neighbour);
            }
        }
    }
}