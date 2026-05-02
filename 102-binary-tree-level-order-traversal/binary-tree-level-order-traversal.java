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
        List<List<Integer>> r = new ArrayList<>();
        if(root == null) return r;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> l = new ArrayList<>();
            while(s-->0){
                TreeNode c = q.remove();
                l.add(c.val);
                if(c.left != null){
                    q.add(c.left);
                }
                if(c.right != null){
                    q.add(c.right);
                }
            }
            r.add(l);
        }
        return r;
    }
}