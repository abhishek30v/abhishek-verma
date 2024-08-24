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
    public ListNode partition(ListNode head, int x) {
      if(head == null){
       return null;
      }

      ListNode smallerNode = new ListNode(-1);
      ListNode greaterNode = new ListNode(-1);
      ListNode smaller = smallerNode , greater = greaterNode, curr = head;

      while(curr != null){
        if(curr.val < x){
            smaller.next = curr;
            smaller = smaller.next;
        }
        else{
            greater.next = curr;
            greater = greater.next;
        }
        curr = curr.next;
      }
smaller.next = greaterNode.next;
greater.next = null;
return smallerNode.next;
    }
}
