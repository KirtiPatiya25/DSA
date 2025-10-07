class Solution {

    public int noOfPaths(TreeNode root, long targetSum){
        if(root==null) return 0;
        int count = 0;
        if((long) (root.val) == targetSum){
            count++;
        }
        return count +  noOfPaths(root.left, targetSum-(long) (root.val)) + noOfPaths(root.right, targetSum- (long) (root.val));
    }
    public int pathSum(TreeNode root, long targetSum) {
        if (root == null) return 0; 
        int count  = noOfPaths(root,(long) (targetSum));
        count += (pathSum(root.left, targetSum) + pathSum(root.right, targetSum)); 
        return count;
    }
}