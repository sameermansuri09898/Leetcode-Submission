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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        // calculate the size

        ListNode temp = head;
        int size =0;

        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int mid = size/2;
        ListNode prev = head;
        int i =0;

        while(i<mid-1){
            prev = prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return head;

    }
}