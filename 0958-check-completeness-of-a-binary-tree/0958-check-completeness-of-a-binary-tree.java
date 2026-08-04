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
    public int hight(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + hight(root.left) + hight(root.right);
    }

    public boolean cbt(TreeNode root, int idx, int height) {
        if (root == null)
            return true;
        if (idx > height)
            return false;
        return cbt(root.left, idx * 2, height) && cbt(root.right, idx * 2 + 1, height);
    }

    public boolean isCompleteTree(TreeNode root) {
        int height=hight(root);
        return cbt(root,1,height);

    }
}