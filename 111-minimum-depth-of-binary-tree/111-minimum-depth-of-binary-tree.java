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
    public int minDepth(TreeNode root) {
        int result = getHeight(root, 1);
        return Math.max(0, result);
    }
    
    public int getHeight(TreeNode root, int height) {
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return height;
        }
        int left = getHeight(root.left, height + 1);
        int right = getHeight(root.right, height + 1);
        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }
        return Math.min(left, right);
    }
}