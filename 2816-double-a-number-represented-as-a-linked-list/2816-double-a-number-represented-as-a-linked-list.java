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
    public ListNode doubleIt(ListNode head) {
       ListNode temp=copyList(head);
        return addTwoNumbers(head, temp);
    }
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        l1=reverse(l1);
        l2=reverse(l2);
        
        ListNode ans=helper(l1, l2);
        ans=reverse(ans);
        
        return ans;
        
    }
     public ListNode helper(ListNode l1, ListNode l2) {
         
        if(l1==null)
        {
            return l2;
        }
        
        if(l2==null)
        {
            return l1;
        }
        
        int carry=0;
        ListNode dummy= new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null || l2!=null || carry!=0)
        {
            int sum=0;
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            
            sum+=carry;
            carry=sum/10;
            ListNode newnode= new ListNode(sum%10);
            dummy.next=newnode;
            dummy=dummy.next;
            
        }
        return temp.next;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode copyList(ListNode head)
    {
        if (head == null) {
            return null;
        }
 
        // allocate a new node in a heap and set its data
        ListNode newNode = new ListNode(head.val);
 
        // recursively set the next field of the new node by recurring
        // for the rest nodes
        newNode.next = copyList(head.next);
 
        return newNode;
    }
}