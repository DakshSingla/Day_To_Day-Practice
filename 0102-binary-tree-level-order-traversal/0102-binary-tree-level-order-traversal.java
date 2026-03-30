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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        check(root, list, 0);
        return list;
    }
    public void check(TreeNode cur, List<List<Integer>> ans, int l){
        if(cur == null) return;
        if(ans.size() == l) ans.add(new ArrayList<>());
        ans.get(l).add(cur.val);
        check(cur.left,ans,l+1);
        check(cur.right,ans,l+1);
    }
}