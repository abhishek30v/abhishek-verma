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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      if(head == null || head.next == null){
        return null;
      }   

      int k =0;  
      ListNode temp = head;
      while(temp!=null){
        temp=temp.next;
        k++;
      }
    
      if(k==n){
        head = head.next;
        return head;
      }

        temp = head;
      for(int i=0;i<k-n-1;i++){
          temp = temp.next;
      }
      
     temp.next = (temp.next!=null)? temp.next.next:null;
      return head;
    }
}