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
    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,nxt=null;

        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head){
          ListNode slow = head,fast = head;
          while(fast!=null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
          }
          return slow;
    }
     
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) {
            return;  
        }

        ListNode middle = findMiddle(head);
        ListNode reverseHead = reverse(middle);
        ListNode temp = head,curr = temp.next,curr1 = reverseHead.next;

        while(curr1 != null){
            temp.next = reverseHead;
            temp = curr;
            reverseHead.next = temp;
            reverseHead = curr1;
            curr = curr.next;
            curr1 = curr1.next;
        }
    }
}
