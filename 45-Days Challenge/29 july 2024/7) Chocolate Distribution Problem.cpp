class Solution{
    public:
    long long findMinDiff(vector<long long> a, long long n, long long m){
        
         sort(a.begin(),a.end());
         
         long long mini = LLONG_MAX;
         
         for(long long i=0;i+m<=n;i++){
             long long diff = a[i+m-1] - a[i];
             mini = min(mini,diff);
         }
         return mini;
    }   
};