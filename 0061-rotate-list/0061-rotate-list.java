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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }

        ListNode temp = head;
        int len =1;

        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        k = k%len;
        if(k==0){
            return head;
        }
        temp.next = head; // now ll is circular

        
        
        int step = len - k - 1;
        ListNode newTail = head;

        for(int i =0;i<step;i++){
            newTail = newTail.next;
        }
        // New head is next of new tail

        ListNode newHead = newTail.next;

        // break circular connection

        newTail.next = null;
        
        
    return newHead;    
    }
}