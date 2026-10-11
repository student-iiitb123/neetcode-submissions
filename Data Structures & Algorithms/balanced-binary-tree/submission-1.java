
class Solution {

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        if (left == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int right = height(root.right);
        if (right == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if (Math.abs(left - right) > 1) {
            return Integer.MIN_VALUE;
        }

        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) != Integer.MIN_VALUE;
    }
}
