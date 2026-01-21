class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right){
        if(left == null || right==null){
            return left==right;
        }
        if(left.val !=right.val){
            return false;
        }
        return check(left.left, right.right) && check(left.right, right.left);
    }
}