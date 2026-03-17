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
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode leftSub=root.left;
        TreeNode rightSub=root.right;
        flatten(leftSub);
        flatten(rightSub);
        root.left=null;
        root.right=leftSub;
        TreeNode temp=leftSub;
        while(temp!=null && temp.right!=null){
            temp=temp.right;
        }
        if(temp!=null)temp.right=rightSub;
        else root.right=rightSub;
        return;  
    }
}