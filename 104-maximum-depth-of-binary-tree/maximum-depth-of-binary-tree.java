class Solution {
    public int maxDepth(TreeNode root) {
        int h = 0;
        if(root == null)return h;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                TreeNode x = q.remove();
                if(x.left != null){
                    q.add(x.left);
                }
                if(x.right != null){
                    q.add(x.right);
                }
            }
            h++;
        }
        return h;
    }
}