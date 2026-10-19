
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) return list;

        q.offer(root);

        while (!q.isEmpty()) {

            int levelsize = q.size();

            for (int i = 0; i < levelsize; i++) {

                TreeNode curr = q.poll();

                // Last node of this level
                if (i == levelsize - 1) {
                    list.add(curr.val);
                }

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
        }

        return list;
    }
}
