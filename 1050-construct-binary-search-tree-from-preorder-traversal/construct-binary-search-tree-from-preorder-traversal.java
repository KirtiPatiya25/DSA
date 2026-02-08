class Solution {
    int i =0;
    public TreeNode helper(int[] preorder,  int bound){
        if(i>= preorder.length || preorder[i] > bound) return null;

        TreeNode root = new TreeNode(preorder[i++]);
        root.left = helper(preorder, root.val);
        root.right = helper(preorder, bound);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        
        return helper(preorder, Integer.MAX_VALUE);
    }
}