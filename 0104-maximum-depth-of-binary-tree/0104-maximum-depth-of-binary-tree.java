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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        if (root == null) return 0;
        while(true){
            int countlevel = q.size();
            if(countlevel== 0){
                return level;
            }
            while(countlevel>0){
                TreeNode ele = q.poll();
                if(ele.left!=null){
                    q.add(ele.left);
                }
                if(ele.right!=null){
                    q.add(ele.right);
                }
                countlevel--;
            }
            level++;
        }

        // if(root==null) return 0;
        // return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}