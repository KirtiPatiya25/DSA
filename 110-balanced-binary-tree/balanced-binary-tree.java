class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return levels(root) != -1;
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        if(leftLevels == -1 || rightLevels == -1 || Math.abs(leftLevels - rightLevels)>1) return -1;
        return 1+ (Math.max(leftLevels,rightLevels));
    }
}

