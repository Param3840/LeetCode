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
     public static TreeNode invert(TreeNode root){
        if (root == null) return null;
        if (root.left==null && root.right==null) return root;
        TreeNode left=invert(root.left);
        TreeNode right=invert(root.right);

        root.left=right;
        root.right=left;
        return root;
    }
    public  boolean same(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        if (root1.val != root2.val) return false;
        boolean left=same(root1.left,root2.left);
        boolean right=same(root1.right,root2.right);
        return left && right;
    }
    public  boolean isSymmetric(TreeNode root){
        if (root==null) return true;
        root.left=invert(root.left);
        return same(root.left,root.right);
    }
}