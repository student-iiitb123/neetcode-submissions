class Solution {

    boolean DFS(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }

        
        if (root.val <= min || root.val >= max) {
            return false;
        }

       
        boolean left = DFS(root.left, min, root.val);

       
        boolean right = DFS(root.right, root.val, max);

        return left && right;
    }

    public boolean isValidBST(TreeNode root) {
        return DFS(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}