public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean cy = false;

       ListNode slow = head;
       ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cy = true;
                break;
            }
        }
        return cy;
    }
}