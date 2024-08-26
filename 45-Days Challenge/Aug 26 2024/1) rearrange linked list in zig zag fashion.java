/*Node is as follows:

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    void swap(Node a,Node b){
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }     
    
    Node zigZag(Node head) {
       Node temp =head;
       boolean flag = false;
       
       while(temp.next != null){
           if(flag == false){
               if(temp.data > temp.next.data){
                  swap(temp,temp.next);
               }
              flag = true;
           }
           else{
               if(temp.data < temp.next.data){
                   swap(temp,temp.next);
               }
               flag = false;
           }
           temp = temp.next;
           }
       return head;
    }
}