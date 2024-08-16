class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        Node p1,p2;
        p1 = first;
        p2= second;
        long num1=0,num2=0;
        long mod = 1000000007;
        
        while(p1!=null){
            num1 = (num1 * 10 +(p1.data))%mod;
            p1=p1.next;
        }
        
         while(p2!=null){
            num2 = (num2 * 10 +(p2.data))%mod;
            p2 = p2.next;
        }
        long ans = (num1*num2)%mod;
        return ans%mod;
    }
}