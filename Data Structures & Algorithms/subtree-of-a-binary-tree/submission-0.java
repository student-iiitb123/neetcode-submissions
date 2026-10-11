
class Solution {

    TreeNode find(TreeNode root, TreeNode subRoot) {
        if (root == null) return null;

        if (root.val == subRoot.val) return root;

        TreeNode left = find(root.left, subRoot);
        if (left != null) return left;

        return find(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return left && right;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;

        TreeNode f = find(root, subRoot);

        if (f != null && isSameTree(f, subRoot)) return true;

        return isSubtree(root.left, subRoot)
            || isSubtree(root.right, subRoot);
    }
}
