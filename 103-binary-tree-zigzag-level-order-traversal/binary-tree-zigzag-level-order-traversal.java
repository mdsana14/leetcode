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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean b = true;
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> r = new ArrayList<>();
            while(s-->0){
                TreeNode x = q.remove();
                if(b){
                    r.add(x.val);
                }
                else{
                    r.add(0,x.val);
                }
                if(x.left != null){
                    q.add(x.left);
                }
                if(x.right != null){
                    q.add(x.right);
                } 
            }
            ans.add(r);
            b = !b;   
        }
        return ans;
    }
}