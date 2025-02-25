class Solution {
public:
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        deque<int> post(postorder.begin(),postorder.end());
        return build(inorder,post);
    }
    TreeNode* build(vector<int>&inorder,deque<int>&post)
    {
        if(!inorder.empty())
        {
            int val= post.back();
            post.pop_back();
            auto it= find(inorder.begin(),inorder.end(),val);
            int index= it-inorder.begin();

            TreeNode* root=new TreeNode(val);
            vector<int>left(inorder.begin(),inorder.begin()+index);
            vector<int>right(inorder.begin()+index+1,inorder.end());

            root->right=build(right,post);
            root->left=build(left,post);
/*In postorder traversal (Left → Right → Root), the last element is always the root. When reconstructing the tree, we process the last element first, meaning the right subtree must be built before the left to maintain the correct order of node construction.*/            
            return root;
        }
        return nullptr;
    }
};
