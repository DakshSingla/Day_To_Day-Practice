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
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[1];
        ans[0] = Integer.MIN_VALUE;
        check(root,ans);
        return ans[0]; 
    }
    public int check(TreeNode node , int[] arr){
        if(node==null) return 0;
        int left = Math.max(0,check(node.left,arr));
        int right = Math.max(0,check(node.right,arr));
        arr[0] = Math.max(arr[0],(left+right+node.val));
        return Math.max(left,right)+node.val;
    }

}