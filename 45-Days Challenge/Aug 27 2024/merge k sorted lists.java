/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Pair{
    int val;
    ListNode node;
    Pair(int val,ListNode node){
        this.val = val;
        this.node = node;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> a.val - b.val);

       for(ListNode list : lists){
           if(list != null){
               pq.add(new Pair(list.val,list));
           }
       }

       ListNode dummy = new ListNode(-1);
       ListNode temp = dummy;

       while(!pq.isEmpty()){
         Pair pair = pq.poll();
         if(pair.node.next != null){
            pq.add(new Pair(pair.node.next.val,pair.node.next));
         }
         temp.next = pair.node;
         temp = temp.next;
       }
       return dummy.next;
}
}
