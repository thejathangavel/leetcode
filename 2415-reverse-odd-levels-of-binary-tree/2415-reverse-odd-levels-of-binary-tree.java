class Solution {
    public void reverseOdd(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) return;
        if (level % 2 != 0) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        reverseOdd(left.left, right.right, level + 1);
        reverseOdd(left.right, right.left, level + 1);
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;
        reverseOdd(root.left, root.right, 1);
        return root;
    }
}