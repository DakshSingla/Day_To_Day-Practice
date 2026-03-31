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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        total(root);
        return maxsum;
    }
    public int total(TreeNode root){
        if(root == null) return 0;
        int l= total(root.left);
        int r = total(root.right);
        l=  Math.max(0,l);
        r=  Math.max(0,r);
        maxsum = Math.max(maxsum, l+r+root.val);
        return root.val+Math.max(l,r);
    }
}