class Solution {
    public boolean isValidBST(TreeNode root) {
        return vbst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean vbst(TreeNode root,long min,long max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max) return false;
        return vbst(root.left,min,root.val) && vbst(root.right,root.val,max);
    }
}