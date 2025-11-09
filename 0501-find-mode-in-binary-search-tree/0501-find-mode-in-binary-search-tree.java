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
    TreeNode pre=null;
    int max=0;
    int count=0;
    ArrayList<Integer> arrl = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int n = arrl.size();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = arrl.get(i);
        }
        return arr;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(pre==null|| root.val!= pre.val){
            count=1;
        }
        else count++;
        if(count>max){
            max = count;
            arrl.clear();
            arrl.add(root.val);
        }
        else if(count == max) arrl.add(root.val);
        pre = root;
        inorder(root.right);
    }
}