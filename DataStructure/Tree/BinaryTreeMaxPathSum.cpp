class Solution {
public:
    int ans = INT_MIN;

    int maxPathSum(TreeNode* root) {
        helper(root);
        return ans;
    }

private:
    int helper(TreeNode* root) {
        if (!root) return 0;
        
        int left = max(0, helper(root->left));
        int right = max(0, helper(root->right));

        ans = max(ans, root->val + left + right);

        return root->val + max(left, right);
    }
};
