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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        check(root1,l1);
        check(root2,l2);
        return l1.equals(l2);
    }
    public void check(TreeNode node1,List<Integer> l1 ){
        if(node1==null) return;
        if(node1.left==null&&node1.right==null){
            l1.add(node1.val);
        }
        check(node1.left,l1);
        check(node1.right,l1);
    }
}