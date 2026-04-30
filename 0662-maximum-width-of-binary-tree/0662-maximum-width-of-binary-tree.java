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
    public static class pair{
        TreeNode node;
        int idx;
        pair(TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        int maxw = 0;
        while(!q.isEmpty()){
            int size= q.size();
            int f = 0, l=0;
            int start = q.peek().idx;
            for(int i = 0;i<size;i++){
                pair it= q.remove();
                TreeNode cur = it.node;
                int idx = it.idx-start;
                if(i==0) f= idx;
                if(i == size-1) l=idx;
                if(cur.left != null) q.add(new pair(cur.left, 2*idx+1));
                if(cur.right != null) q.add(new pair(cur.right, 2*idx+2));
            }
            maxw = Math.max(maxw, l-f+1);
        }
        return maxw;
    }
}