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
    public int countNodes(TreeNode root) {
        if(root == null)return 0;
        int l = 0;
        int r = 0;
        TreeNode t = root;
        while(t != null){
            l++;
            t = t.left;
        }
        TreeNode tp = root;
        while(tp != null){
            r++;
            tp = tp.right;
        }
        if(l == r){
            return (1 << l) -1;
        }
        return (1 + countNodes(root.left) + countNodes(root.right));
        
    }
}