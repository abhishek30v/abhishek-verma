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
    public ListNode getmiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            }
            return slow;
    }

    public boolean isPalindrome(ListNode head) {
      ListNode curr = getmiddle(head),prev = null, nxt = null;

      while(curr != null){
         nxt = curr.next;
         curr.next = prev;
         prev = curr;
         curr = nxt;
      }

      ListNode temp = head;

      while(prev != null){
        if(temp.val != prev.val){
            return false;
        }
        temp = temp.next;
        prev = prev.next;
      }
      return true;
}
}