/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<TreeNode> search(TreeNode root,TreeNode target,List<TreeNode>path){
        if(root == null){
            return null;
        }

        path.add(root);

        if(root == target){
            return new ArrayList<>(path);
        }

        List<TreeNode> left = search(root.left,target,path);
        if(left != null){
            return left;
        }

        List<TreeNode> right = search(root.right,target,path);
        if(right != null){
            return right;
        }

        path.remove(path.size() -1);
        return null;
        

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        List<TreeNode> l1 = new ArrayList<>();
        List<TreeNode> l2 = new ArrayList<>();

        List<TreeNode> path1 = search(root, p, l1);
        List<TreeNode> path2 = search(root, q, l2);


         int i = 0;

        while (i < path1.size() && i < path2.size()
                && path1.get(i) == path2.get(i)) {
            i++;
        }

        return path1.get(i - 1);

    }
}
