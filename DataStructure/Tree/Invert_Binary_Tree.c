class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        if(root==NULL)return NULL;
        if(root->right==NULL&&root->left==NULL)return root;
        
            TreeNode*temp=root->left;
            root->left=root->right;
            root->right=temp;
        
        invertTree(root->left);
        invertTree(root->right);
        return root;
    }
};
