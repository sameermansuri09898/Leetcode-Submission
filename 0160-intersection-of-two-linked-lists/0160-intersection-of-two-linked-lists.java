/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int lenA =0;
        int lenB = 0;

        // calculate len of both list

        while(tempA!=null){
            tempA = tempA.next;
            lenA++;
            
        }
        while(tempB!=null){
            tempB = tempB.next;
            lenB++;
            
        }

        // now make both equal longer ko ek pointer move kro skip krke
        tempA = headA;
        tempB = headB;


        while(lenA>lenB){
            tempA = tempA.next;
            lenA--;
        }
        while(lenA<lenB){
            tempB = tempB.next;
            lenB--;
        }

        while(tempA!=null & tempB!=null){
            if(tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

    return null;    

    }
}