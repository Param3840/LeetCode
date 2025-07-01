class Solution {
    public static void level(TreeNode root, int n, List<Integer> ls) {
        if (root == null) return;
        if (n == 1) {
            ls.add(root.val);
        } else {
            level(root.left, n - 1, ls);
            level(root.right, n - 1, ls);
        }
    }

    public static void level2(TreeNode root, int n, List<Integer> ls) {
        if (root == null) return;
        if (n == 1) {
            ls.add(root.val);
        } else {
            level2(root.right, n - 1, ls);
            level2(root.left, n - 1, ls);
        }
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        int h = height(root); // already returns correct height (starting from 1)
        for (int i = 1; i <= h; i++) {
            List<Integer> levelList = new ArrayList<>();
            if (i % 2 != 0)
                level(root, i, levelList);
            else
                level2(root, i, levelList);
            ans.add(levelList);
        }
        return ans;
    }
}
