// Last updated: 2026. 7. 16. 오전 11:26:40
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxLength = 0;
    
    int dfs(TreeNode* node) {
        if (!node) return 0;
        int left = dfs(node->left);
        int right = dfs(node->right);
        maxLength = max(maxLength, left + right);
        return max(left, right) + 1;
    }
    
    int diameterOfBinaryTree(TreeNode* root) {
        dfs(root);
        return maxLength;
    }
};