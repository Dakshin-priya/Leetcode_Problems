class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        TreeNode*p=root->left;
        TreeNode*q=root->right;
        return isSameTree(p,q);
    }
    bool isSameTree(TreeNode*p,TreeNode*q)
    {
        if(p==NULL && q==NULL)return true;
        if(p==NULL && q)return false;
        if(p &&q==NULL)return false;
        return p->val==q->val &&isSameTree(p->left,q->right)&& isSameTree(p->right,q->left);
    }
    
};
