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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        find(root, ans, 0);
        return ans;
    }
    public void find(TreeNode root, List<Integer> ans, int hd){
        if(root == null) return;
        if(hd == ans.size()) ans.add(root.val);
        find(root.right, ans, hd+1);
        find(root.left, ans, hd+1);
    }
}