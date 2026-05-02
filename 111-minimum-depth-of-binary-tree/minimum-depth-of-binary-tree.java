class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)return 0;
        int h = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                TreeNode c = q.remove();
                if(c.left == null && c.right == null)return h;
                if(c.left != null){
                    q.add(c.left);
                }
                if(c.right != null){
                    q.add(c.right);
                }
            }
            h++;
        }
        return -1;
    }
}