/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
      

        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode curr=slow.next;
        ListNode prev=null;
        slow.next=null;
        while(curr!=null)
        {
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
           
        }
        ListNode merge1=head;
        ListNode merge2=prev;
        while(merge2!=null)
        {
            ListNode temp1=merge1.next;
            ListNode temp2=merge2.next;
            merge1.next=merge2;
            merge2.next=temp1;
            merge2=temp2;
            merge1=temp1;
            
        }



    }
}