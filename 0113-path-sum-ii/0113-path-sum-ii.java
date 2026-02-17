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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        check(root,targetSum,temp);
        return ans;
    }
    public void check(TreeNode node , int ts,List<Integer> a){
        if(node==null) return;
        a.add(node.val);
        ts -= node.val;
        if(node.left==null&&node.right==null&&ts==0){
            ans.add(new ArrayList<>(a)); 
        }
        check(node.left,ts,a);
        check(node.right,ts,a);
        a.remove(a.size()-1);
    }
}