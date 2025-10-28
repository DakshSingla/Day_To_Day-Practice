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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        if(root==null){
            return 0;
        }
        int mindep = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                TreeNode ele= q.poll();
                if(ele.left==null&& ele.right==null){
                    return mindep;
                }
                if(ele.left!= null){
                    q.offer(ele.left);
                }
                if(ele.right!= null){
                    q.offer(ele.right);
                }
            }
            mindep++;
        }
        return mindep;
    }
}