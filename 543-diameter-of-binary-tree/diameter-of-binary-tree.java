
class Solution {
    int d =0;
    public int diameterOfBinaryTree(TreeNode root) {
        fh(root);
        return d;
    }
    private int fh(TreeNode root){
        if(root == null) return 0;
        int l = fh(root.left);
        int r = fh(root.right);
        d = Math.max(d,(l+r));
        return Math.max(l,r)+1;
    }
}