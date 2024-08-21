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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
           ListNode dummy = new ListNode(-1);
           dummy.next = head;
           ListNode leftpart=dummy,curr = head;

           for(int i=0;i<left-1;i++){
            leftpart = leftpart.next;
            curr = curr.next;
           }
                      
           ListNode prev = null,nxt = null,sublistHead = curr;
           for(int i=0;i<right-left+1;i++){
              nxt = curr.next;
              curr.next = prev;
              prev = curr;
              curr = nxt;
           }
           leftpart.next = prev;
           sublistHead.next = curr;
          
           return dummy.next;
    }
}