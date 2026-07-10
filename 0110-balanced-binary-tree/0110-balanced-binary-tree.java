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
    public int helper( TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(helper(root.left),helper(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int a= helper(root.left);
        int b=helper(root.right);
        if(Math.abs(a-b)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}