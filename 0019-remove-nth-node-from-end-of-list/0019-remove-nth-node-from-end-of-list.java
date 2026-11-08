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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null){
            return head;
        }

        // calculate size
        ListNode temp = head;
        int sz =0;

        while(temp!=null){
            temp = temp.next;
            sz++;  
        }

        // removefirts
        if(n==sz){
            head=head.next;
            return head;
        }

        // remove nth node

         ListNode prev = head;
         int nthnode = sz-n;
         int i =0;
         while(i<nthnode-1){
            prev = prev.next;
            i++;
         }
         prev.next = prev.next.next;
         return head;


        
    }
}