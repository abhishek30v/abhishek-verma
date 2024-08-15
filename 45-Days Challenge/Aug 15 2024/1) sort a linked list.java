class Solution {
   
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
     
    public Node mergesort(Node left,Node right){
        Node dummynode = new Node(-1);
        Node temp = dummynode;
        
        while(left != null && right != null){
            if(left.data < right.data){
                temp.next = left;
                temp = left;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }
        
        while(left != null){
            temp.next = left;
            temp = left;
            left = left.next;
        }
        while(right != null){
            temp.next = right;
            temp = right;
            right = right.next;
        }
        return dummynode.next;
    }   
  
    public Node sort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node middle = findMiddle(head);
        Node lefthead = head;
        Node righthead = middle.next;
        middle.next = null;
        
       lefthead = sort(lefthead);
       righthead = sort(righthead);
       return mergesort(lefthead,righthead);
    }
 }