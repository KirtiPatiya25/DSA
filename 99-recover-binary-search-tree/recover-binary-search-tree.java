class Solution {
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode sec = null;
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
            if(prev != null && root.val < prev.val){
                if(first == null){
                    first = prev;
                }
                sec = root;
            }
            prev = root;
        inorder(root.right);
    }


    public void recoverTree(TreeNode root) {
        inorder(root);

        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;
    }
}