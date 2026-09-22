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
    public int ans = 0;
    public int closestValue(TreeNode root, double target) {
        double mini = Integer.MAX_VALUE;
        check(root,target,mini);
        return ans;
    }
    public void check(TreeNode node, double target,double mini){
        if(node == null) return;
        double dif = (double) Math.abs(node.val-target);
        if(dif<mini){
            mini = dif;
            ans = node.val;
        }
        if(target<node.val){
            check(node.left,target,mini);
        }
        if(target>node.val){
            check(node.right,target,mini);
        }
    }
}
