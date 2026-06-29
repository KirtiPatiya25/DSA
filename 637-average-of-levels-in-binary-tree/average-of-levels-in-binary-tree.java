class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();

        if (root == null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            long sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode ele = q.poll();

                sum += ele.val;

                if (ele.left != null)
                    q.offer(ele.left);

                if (ele.right != null)
                    q.offer(ele.right);
            }

            double avg = (double) sum / size;
            res.add(avg);
        }

        return res;
    }
}