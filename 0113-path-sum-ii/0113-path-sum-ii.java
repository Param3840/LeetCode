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
     public static void path(TreeNode root,int target, List<Integer> ls, List<List<Integer>> ans){
        if (root==null) return;
        ls.add(root.val);
        if (root.left==null && root.right==null && target== root.val) {
            ans.add(new ArrayList<>(ls));
        }
        path(root.left,target-root.val,ls,ans);
        path(root.right,target- root.val,ls,ans);
        ls.remove(ls.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        path(root,targetSum,ls,ans);
        return ans;
    }
}