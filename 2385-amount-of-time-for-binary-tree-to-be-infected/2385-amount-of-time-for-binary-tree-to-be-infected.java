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

    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        // build parent map + find start node
        TreeNode startNode = buildParent(root, null, parent, start);
        // BFS
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.add(startNode);
        visited.add(startNode);

        int time = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            time++;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.add(curr.left);
                }

                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.add(curr.right);
                }

                if (parent.get(curr) != null && !visited.contains(parent.get(curr))) {
                    visited.add(parent.get(curr));
                    q.add(parent.get(curr));
                }
            }
        }

        return time;
    }

    private TreeNode buildParent(TreeNode node, TreeNode par,
        Map<TreeNode, TreeNode> parent,int start) {
        if (node == null) return null;
        parent.put(node, par);
        if (node.val == start) return node;
        TreeNode left = buildParent(node.left, node, parent, start);
        if (left != null) return left;
        return buildParent(node.right,node,parent,start);
    }
}