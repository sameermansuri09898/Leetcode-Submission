/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Cycle detection
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            
            if(slow==fast){

                fast = head; // // Reset fast to head

                // Find cycle starting node
                while(slow!=fast){
                    slow = slow.next;
                    fast =fast.next;
                }
                return slow;
            }


        }
    return null;    
        
    }
}