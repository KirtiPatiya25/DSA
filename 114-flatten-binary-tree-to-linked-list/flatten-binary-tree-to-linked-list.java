class Solution {
    public void flatten(TreeNode root) {
        if(root ==  null) return;
        TreeNode leftTree = root.left;
        TreeNode rightTree = root.right;
        root.left = null;
        flatten(leftTree);
        flatten(rightTree);
        root.right = leftTree;
        TreeNode temp = leftTree;
        while(temp!=null && temp.right != null){
            temp = temp.right;
        }
        if(temp!=null) temp.right = rightTree;
        else root.right = rightTree;
        return;
    }
}