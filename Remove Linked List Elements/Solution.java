/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) 
    {
        while(head!=null&&head.val==val)
        {
            head=head.next;
        }
        ListNode temp=null;
        if(head!=null)
             temp=head.next;
        ListNode temp2=head;
        while(temp!=null)
        {
                
               if(temp.val==val)
                {
                   temp2.next=temp.next;
                   temp.next=null;
                   temp=temp2.next;
                   continue;
                }
                if(temp.next==null)
                     break;
                temp=temp.next;
                temp2=temp2.next;
                
            
        }
        
        return head;
    }
}