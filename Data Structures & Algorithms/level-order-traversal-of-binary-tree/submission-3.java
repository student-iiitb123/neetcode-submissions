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
 void BFS(TreeNode root, List<List<Integer>> ll, Queue<TreeNode> q ){
     if (root == null) {
            return;
        }

     q.add(root);
     while(!q.isEmpty()){
        int levelsize = q.size();
        List<Integer> l = new ArrayList<>();
        while(levelsize-- > 0){
            TreeNode curr = q.poll();
            
             l.add(curr.val);

             if(curr.left != null){
              q.offer(curr.left);

     }
           if(curr.right != null){
            q.offer(curr.right);
    }
        }
      ll.add(l);

    
   
   
  }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ll = new ArrayList<>();
       
        BFS(root,ll,q);
        return ll;

        
    }
}
