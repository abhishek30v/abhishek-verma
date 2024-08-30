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
    public ListNode reverseLL(ListNode head){
        ListNode curr = head,prev = null,nxt= null;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;   
        }
        return prev;
    }

    public ListNode findkthNode(ListNode temp,int k){
        while(temp != null && k>1){
             k--;
             temp = temp.next;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head, prevNode = null;

        while(temp != null){
            ListNode kthNode = findkthNode(temp,k);
            if(kthNode == null){
               if(prevNode != null){
                   prevNode.next = temp;
                   break;
               }
            }
    
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseLL(temp);

            if(temp == head){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            } 
        prevNode = temp;
        temp = nextNode;
        }
        return head;
    }
}