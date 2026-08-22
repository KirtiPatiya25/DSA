class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy  = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;


        for(int i=0; i<n; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}