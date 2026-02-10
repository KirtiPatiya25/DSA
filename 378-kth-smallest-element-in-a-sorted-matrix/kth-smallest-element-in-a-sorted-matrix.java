class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int[] row : matrix){
            for(int ele : row){
                pq.add(ele);
                if(pq.size()>k) pq.remove();
            }
        }
        return pq.peek();
    }
}


