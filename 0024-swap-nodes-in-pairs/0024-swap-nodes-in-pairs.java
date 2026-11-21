class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }

        ListNode first = head;
        ListNode sec = head.next;
        ListNode prev = null;

        while(first!=null && sec!=null){
            ListNode third = sec.next; // secure 3rd ll bcoz 2nd break connection

            // swap current pair
            sec.next = first;
            first.next = third;

            // connect previous
            if(prev!=null){
                prev.next = sec;
            }
            else{
                head = sec;
            }

            // move ahead

            prev = first;
            first = third;

            if(first!=null){ // check ex1 one sec last node
                sec = first.next;
            }

        }
    return head;

    }
}