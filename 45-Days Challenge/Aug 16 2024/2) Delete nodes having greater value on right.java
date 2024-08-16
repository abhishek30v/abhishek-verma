class Solution {
    Node compute(Node head) {
        head = reverseList(head);

        Node curr = head;
        Node maxNode = head;
 
        while(curr != null && curr.next !=null){
            if(curr.next.data < maxNode.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
                maxNode = curr;
            }
        }
    head = reverseList(head);
    return head;
 }

    Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
} 