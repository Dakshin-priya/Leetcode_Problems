#include<stack>
class Solution {
public:
    vector<int> preorderTraversal(TreeNode* root) {
        stack <TreeNode*> s;
        TreeNode*curr=root;
        s.push(curr);
        vector<int> a;
        if(root==NULL)
            return a;
        while(!s.empty())
        {
            while(curr)
            {
                a.push_back(curr->val);
                curr=curr->left;
                if(curr)
                    s.push(curr);
            }
            TreeNode*temp=s.top();
            s.pop();
            if(temp->right)
            {
                s.push(temp->right);
                curr=temp->right;
            }
        }
        return a;
    }
};
