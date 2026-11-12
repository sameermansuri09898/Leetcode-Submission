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

    public static ListNode getmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
    public void reorderList(ListNode head) {
        
        // get mid Node
        ListNode midNode = getmid(head);
        ListNode curr = midNode.next;
        midNode.next = null;
        ListNode prev = null;
        ListNode next ;

        while(curr!=null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr =next;
        }

        ListNode left = head;
        ListNode right =prev;
        ListNode nextl,nextr;

        while(left!=null && right!=null){
           nextl = left.next;
           nextr = right.next;

           left.next = right;
           right.next = nextl;

           left = nextl;
           right = nextr;
        }  
    }
}