/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null && headB == null){
        return null;
    }

    ListNode temp1=headA;
    ListNode temp2 = headB;
    int l1=0,l2=0;
    while(temp1 != null || temp2!=null){
        if(temp1 != null){
        temp1 = temp1.next;
        l1++;
        }
        if(temp2 != null){
        temp2 = temp2.next;
        l2++;
        }
    }

temp1=headA;
temp2 = headB;
    while(l1 != l2){
        if(l1 > l2){
            l1--;
            temp1 = temp1.next;
        }else{
            l2--;
            temp2 = temp2.next;
        }
    }

while(temp1 != null && temp2 != null){
    if(temp1 == temp2){
        return temp1;
    }
        temp1 = temp1.next;
        temp2 = temp2.next;
}   
return null; 
}
}
