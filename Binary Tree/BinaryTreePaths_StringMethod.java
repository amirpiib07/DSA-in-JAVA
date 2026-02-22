void dfs(TreeNode root, List<String> ans, String path){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans.add(path+root.val);
            return;
        }
        dfs(root.left, ans, path+root.val+"->");
        dfs(root.right, ans, path+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans= new ArrayList<>();
        if(root==null) return ans;
        dfs(root,ans,""); // string is immutable no backtracking is required
        return ans;
    }
