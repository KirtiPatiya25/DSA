class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        
        ListNode slow=temp;
        ListNode fast=temp;

        for(int i=0; i<=n; i++){
            slow = slow.next;
        }
        while(slow != null){
            slow = slow.next;
           fast = fast.next;
        }
        fast.next = fast.next.next;
        return temp.next;
    }
}