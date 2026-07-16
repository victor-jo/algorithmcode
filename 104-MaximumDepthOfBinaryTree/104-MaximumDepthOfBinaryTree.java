// Last updated: 2026. 7. 16. 오전 11:28:05
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
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }
    
    public int maxDepth(TreeNode node, int level) {
        if (node == null) {
            return level;
        }
        int left = Math.max(level, maxDepth(node.left, level+1));
        int right = Math.max(level, maxDepth(node.right, level+1));
        return Math.max(left, right);
    }
}