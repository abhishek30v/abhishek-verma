class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->b.first - a.first);
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<points.length;i++){
            while(!pq.isEmpty() && points[i][0] - pq.peek().second > k){
                pq.poll();
            }
           
            if(!pq.isEmpty()){
           ans = Math.max(ans, points[i][0] + points[i][1] + pq.peek().first);
            }
           pq.add(new pair( points[i][1]-points[i][0], points[i][0] ));
        }
        return ans;
    }
}

 class pair{
    int first;
    int second;

    public pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
