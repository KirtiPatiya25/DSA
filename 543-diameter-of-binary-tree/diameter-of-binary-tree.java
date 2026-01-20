class Solution {
    public int height(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if(root.right!=null) mid++;
        if(root.left!=null) mid++;
        int max = Math.max(leftAns, Math.max(rightAns, mid));
        return max;
    }
}