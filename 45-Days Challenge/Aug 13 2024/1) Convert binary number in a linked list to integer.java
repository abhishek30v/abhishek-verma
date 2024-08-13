class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int length = 0;
        int number = 0;
        
        while(temp.next!=null){
            length++;
            temp = temp.next;
        }
 
        temp = head;
        while(length>=0){
           int value = temp.val;
           if(value == 1){
              number+= Math.pow(2,length);
           }
           length--;
          temp = temp.next;
        }
       
        return number;
    }
}