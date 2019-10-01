
 
   class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode current=head;
        ListNode next;
        ListNode prev=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        head=prev;
        return head;   
    }
}