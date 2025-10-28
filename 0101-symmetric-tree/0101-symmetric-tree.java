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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root.left);
        q2.add(root.right);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode leftele=q1.poll();
            TreeNode rightele=q2.poll();
            if(leftele == null && rightele==null) continue;
            if(leftele==null || rightele==null) return false;
            if(leftele.val != rightele.val) return false;

            q1.add(leftele.left);
            q1.add(leftele.right);
            q2.add(rightele.right);
            q2.add(rightele.left);

        }
            return true;            
    }
}