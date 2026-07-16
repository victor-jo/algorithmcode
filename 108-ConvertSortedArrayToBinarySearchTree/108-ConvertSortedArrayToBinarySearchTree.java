// Last updated: 2026. 7. 16. 오전 11:28:03
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length - 1);
    }
    
    public TreeNode convert(int[] nums, int begin, int end) {
        if (begin > end) {
            return null;
        }
        
        int mid = (begin + end) / 2;
        return new TreeNode(
            nums[mid],
            convert(nums, begin, mid - 1),
            convert(nums, mid + 1, end)
        );
    }
}