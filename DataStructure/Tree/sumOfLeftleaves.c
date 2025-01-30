class Solution {
public:
int sum=0;
    int sumOfLeftLeaves(TreeNode* root) {
        return count(root);
    }
    int count(TreeNode*root)
    {
        if(root==NULL) return 0;
        if(root->left && !root->left->left && !root->left->right)
            sum+=root->left->val;
        count(root->left);
        count(root->right);
        return sum;
    }
};
