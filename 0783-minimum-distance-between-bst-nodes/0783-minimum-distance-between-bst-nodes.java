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
    static int min=Integer.MAX_VALUE;
    static TreeNode prev=null;
    public static void inorder(TreeNode root){
        if (root==null) return;
        inorder(root.left);
        if (prev!=null){
            int minimumDifference=Math.abs(root.val-prev.val);
            min=Math.min(min,minimumDifference);
        }
        prev=root;
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        min=Integer.MAX_VALUE;
        prev=null;
        inorder(root);
        return min;
    }
}