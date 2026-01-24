class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;

        int maxSum = Integer.MIN_VALUE;
        int result = 1;

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int currLevel = 1;
        while(!q.isEmpty()){
            int n = q.size();
            int sum = 0;

            while(n-- > 0){
                TreeNode temp = q.poll();
                sum +=temp.val;

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            if(sum > maxSum){
                maxSum = sum;
                result = currLevel;
            }
            currLevel++;
        }
        return result;
    }
}