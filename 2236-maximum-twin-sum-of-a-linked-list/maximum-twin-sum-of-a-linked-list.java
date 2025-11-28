class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = list.size() - 1;

        int max = Integer.MIN_VALUE;

        while( i<j ){
            int candidate = list.get(i) + list.get(j);
            max = Math.max(max, candidate);

            i++;
            j--;

        }
        return max;
    }
}