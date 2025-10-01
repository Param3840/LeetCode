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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<>();
        in(root, ls);
        return ls;
    }

    public static void in(TreeNode root, ArrayList<Integer> ls) {
        if (root == null)
            return;
        in(root.left, ls);
        ls.add(root.val);
        in(root.right, ls);
    }
}