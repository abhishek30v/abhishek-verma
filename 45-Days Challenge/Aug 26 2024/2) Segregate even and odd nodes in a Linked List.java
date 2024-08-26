/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        Node evenNodes = new Node(0);
        Node oddNodes = new Node(0);
        Node temp1 = evenNodes,temp2 = oddNodes, curr = head;
        
        while(curr != null){
            if(curr.data%2 == 0){
                temp1.next = curr;
                temp1 = temp1.next;
            }
            else{
                temp2.next = curr;
                temp2 = temp2.next;
            }
            curr = curr.next;
        }
        temp1.next = oddNodes.next;
        temp2.next = null;
        return evenNodes.next;
    }
}