class Solution {
    static int ans;
    public int sumRootToLeaf(TreeNode root) {
        ans=0;
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode root, int curr){
        if(root==null){
            return;
        }
        curr=curr*2+root.val;
        if(root.left==null&&root.right==null){
            ans+=curr;
            return;
        }
        dfs(root.left,curr);
        dfs(root.right,curr);
    }
}
