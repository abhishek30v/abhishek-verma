class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        bfs(adj,0,ans,vis);
        return ans;
    }
    
    private void bfs(ArrayList<ArrayList<Integer>> adj,int curr,ArrayList<Integer> ans,boolean[] vis){
           Queue<Integer> q = new LinkedList<>();
           q.add(curr);
           vis[curr] = true;
           
            while(!q.isEmpty()){
            int val = q.peek();
            q.remove();
            ans.add(val);
            
            for(int i=0;i<adj.get(val).size();i++){
                if(!vis[adj.get(val).get(i)])
                q.add(adj.get(val).get(i));  
                vis[adj.get(val).get(i)] = true;
            }
        }
        
    }        
}