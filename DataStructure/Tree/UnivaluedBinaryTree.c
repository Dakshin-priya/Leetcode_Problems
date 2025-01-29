class Solution {
public:
    bool isUnivalTree(TreeNode* root) {
        int val=root->val;
        return check(val,root);
    }
    bool check(int val,TreeNode*root)
    {
        if(root==NULL)return true;
        if(val!=root->val)return false;
        return check(val,root->left)&& check(val,root->right);
    }
};
