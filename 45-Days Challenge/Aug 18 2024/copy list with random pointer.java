/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
     Node temp = head;
     Node copynode = null;
     //adding copynodes between nodes
     while(temp != null){
        copynode = new Node(temp.val);
        copynode.next = temp.next;
        temp.next = copynode;
        temp = copynode.next;
     }

     temp = head;
     //connecting random nodes with copynodes same as original ones.
     while(temp != null){
          copynode = temp.next;
          if(temp.random != null){
          copynode.random = temp.random.next;
          }else{
            copynode.random = null;
          }
          temp = temp.next.next;
     }

     Node dummynode = new Node(-1);
     Node res = dummynode;
     temp = head;
     //now separate the original and copied one as mentioned in question
     while(temp != null){
        res.next = temp.next;
        temp.next = temp.next.next;
        
        res = res.next;
        temp = temp.next;
     } 
     return dummynode.next;
    }
}