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
    public List<Integer> postorderTraversal(TreeNode root) {
           List<Integer> ary = new ArrayList<>();
        fun (root, ary);
        return ary;
    }
    public void fun(TreeNode root, List<Integer> ary){
        if(root==null) return;
        fun (root.left, ary);
        fun(root.right,ary);
        ary.add(root.val);
    }

}