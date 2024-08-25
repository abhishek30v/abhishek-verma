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
    private ListNode middle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head,fast = head.next;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode mergeSort(ListNode l1,ListNode l2){
      ListNode dummy = new ListNode(0);
      ListNode curr =dummy;
      while(l1!=null && l2!=null){
        if(l1.val < l2.val){
            curr.next =l1;
            l1 = l1.next;
        } else{
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
      }
      curr.next = (l1 != null)?l1:l2;
      return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
    ListNode mid = middle(head);
    ListNode newnode = mid.next;
    mid.next = null;
    ListNode lefthead = sortList(head);
    ListNode righthead = sortList(newnode);
    ListNode result = mergeSort(lefthead,righthead);
    return result;
    }
}