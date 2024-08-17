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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode tail = dummyNode;
        int carry= 0,digit1=0,digit2=0;

        while(l1 != null || l2 !=null || carry == 1){
           digit1 = (l1!=null)? l1.val:0;
           digit2 = (l2!=null)? l2.val:0;

            int sum = 0;
            sum = digit1+digit2+carry;

                carry = sum/10;
                sum = sum % 10;
            
        ListNode newnode = new ListNode(sum);
        tail.next = newnode;
        tail = newnode;

         l1 = (l1 != null) ? l1.next : null;
         l2 = (l2 != null) ? l2.next : null; 
        }
        tail.next = null;
        return dummyNode.next;
    }
}