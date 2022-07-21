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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        
        ListNode curr=dummy;
        ListNode prev=null;
        
       for(int i=0; i<left; i++)
       {
           prev=curr;
           curr=curr.next;
       }
        
        ListNode CurrentNodeToReverse=curr;
        ListNode PrevOfReverse=prev;
        
        for(int i=left; i<=right; i++)
        {
            ListNode NextOfReverse=CurrentNodeToReverse.next;
             CurrentNodeToReverse.next=PrevOfReverse;
             PrevOfReverse=CurrentNodeToReverse;
             CurrentNodeToReverse=NextOfReverse;
        }
        prev.next=PrevOfReverse;
        curr.next=CurrentNodeToReverse;
        return dummy.next;
    }
}