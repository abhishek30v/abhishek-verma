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
        ListNode prev,curr,nxt;
        prev = null;
        curr = head;
        nxt = null;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);
        int digit1=0,digit2=0,carry=0;

        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;

        while(list1 != null || list2 != null || carry == 1){
            digit1 = (list1!=null)? list1.val:0;
            digit2 = (list2!=null)? list2.val:0;

            int sum =0;
            sum = digit1+digit2+carry;
            carry = sum /10;
            sum = sum % 10;

            ListNode temp = new ListNode(sum);
            res.next = temp;
            res = res.next;
            
            list1 = (list1!=null)? list1.next:null;
            list2 = (list2!=null)? list2.next:null;
        }
        dummyNode = reverse(dummyNode.next);
        return dummyNode;
    }
}