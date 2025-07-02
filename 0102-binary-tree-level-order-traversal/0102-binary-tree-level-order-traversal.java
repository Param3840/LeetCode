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
    public static void level(TreeNode root,int n,List<Integer> ls){
        if (root==null) return;
        if (n == 1) ls.add(root.val);
        level(root.left,n-1,ls);
        level(root.right,n-1,ls);
    }
    public static int height(TreeNode root){
        if (root == null) return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        int h=height(root);
        for(int i=1;i<=h;i++){
            List<Integer> ls=new ArrayList<>();
            level(root,i,ls);
            ans.add(ls);
        }
        return ans;
    }
}