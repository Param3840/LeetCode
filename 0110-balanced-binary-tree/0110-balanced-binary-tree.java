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
     public static int tree(TreeNode root){
        if (root==null) return 0;
        int lh=tree(root.left);
        if (lh==-1) return -1;
        int rh=tree(root.right);
        if (rh==-1) return -1;
        int dif=lh-rh;
        if (Math.abs(dif)>1) return -1;
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return tree(root)!=-1;
    }
}