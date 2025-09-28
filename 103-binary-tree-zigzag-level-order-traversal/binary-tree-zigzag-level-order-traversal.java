class Solution {
    public int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null))
        return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nthLevel(TreeNode root, int n, List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        nthLevel(root.left, n-1, arr);
        nthLevel(root.right, n-1, arr);
    }
    public void nthLevel2(TreeNode root, int n, List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        nthLevel2(root.right, n-1, arr);
        nthLevel2(root.left, n-1, arr);
    }
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = height(root) + 1;
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        for(int i=1; i<=level; i++){
            List<Integer> arr = new ArrayList<>();
            if(i%2!=0) nthLevel(root, i, arr);
            else nthLevel2(root, i, arr);
            ans.add(arr);
        }
        return ans;
    }
}