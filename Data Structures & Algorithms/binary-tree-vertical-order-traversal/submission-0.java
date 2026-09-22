/**
 * Definition for a binary tree TreeNode.
 * public class TreeTreeNode {
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
    static class Pair{
        TreeNode node;
        int idx;
        public Pair(TreeNode node , int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Map<Integer,List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair a = q.poll();
            TreeNode cur = a.node;
            int idx = a.idx;
            map.computeIfAbsent(idx,k->new ArrayList<>()).add(cur.val);
            if(cur.left!= null) q.add(new Pair(cur.left,idx-1));
            if(cur.right!= null) q.add(new Pair(cur.right,idx+1));
        }
        return new ArrayList<>(map.values());
    }
}