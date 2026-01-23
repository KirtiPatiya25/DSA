class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // BASE CASE 1
    if (root == null) {
        return false;
    }

    // BASE CASE 2
    if (isSame(root, subRoot)) {
        return true;
    }

    return isSubtree(root.left, subRoot)
        || isSubtree(root.right, subRoot);
    }

    boolean isSame(TreeNode a, TreeNode b) {
    if (a == null && b == null) return true;
    if (a == null || b == null) return false;
    if (a.val != b.val) return false;

    return isSame(a.left, b.left) &&
           isSame(a.right, b.right);
    }
}