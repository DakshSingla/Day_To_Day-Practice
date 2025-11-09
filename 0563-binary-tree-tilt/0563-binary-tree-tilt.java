/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {2
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int tsum = 0;
    public int findTilt(TreeNode root) {
        ddff(root);
        return tsum;
    }
    public int ddff(TreeNode root){
        if(root == null) return 0;
        int rootleft = ddff(root.left);
        int rootright= ddff(root.right);
        int sum = Math.abs(rootleft - rootright);
        tsum+=sum;
        return rootleft+rootright+root.val;       
    }
}