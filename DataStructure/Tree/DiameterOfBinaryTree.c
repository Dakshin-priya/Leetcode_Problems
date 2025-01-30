class Solution {
public:
int ans=0;
    int diameterOfBinaryTree(TreeNode* root) {
        dia(root);
        return ans;
    }
    int dia(TreeNode*root)
    {
        if(root==NULL)return 0;
        int left=dia(root->left);
        int right=dia(root->right);
        ans=max(left+right,ans);
        return max(left,right)+1;
    }
};
