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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        

        inorder(root,arr);
       for(int num:  arr){
        map.put(num , map.getOrDefault(num , 0) + 1);
       }
        int ans =0;
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()> ans){
                ans = entry.getValue();
            }            
       }
        ArrayList<Integer> res = new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==ans){
                res.add(entry.getKey());
            }

       }
        int[] array = new int[res.size()];
        for(int i =0;i<res.size();i++){
            array[i] = res.get(i);
        }
       return array;

    }
    public static void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}