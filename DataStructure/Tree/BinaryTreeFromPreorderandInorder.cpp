class Solution {
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        deque<int> pre(preorder.begin(),preorder.end());
/*
Converts the preorder vector into a deque<int> preorderQueue.
✅ Why use deque?
Allows efficient pop from the front (O(1) time complexity).
vector<int> would require O(n) time to remove the first element.
*/
        return build(pre,inorder);
    }
    TreeNode* build(deque<int> &pre,vector<int> &inorder)
    {
        if(!inorder.empty())
        {
            int val=pre.front();
            pre.pop_front();
            auto it=find(inorder.begin(),inorder.end(),val);
/* /*find(start, end, val) -  searches for val in the given range [start, end)]*/

/*Why is int it = find(...); incorrect?
-> find() returns an iterator, which is a pointer-like object.
-> You cannot store an iterator in an int variable.
-> Fix: Use auto*/
            int index = it - inorder.begin();
/*converts the iterator it into an integer index by computing the distance between it and inorder.begin().*/
            TreeNode*root=new TreeNode(val);
            vector<int> left(inorder.begin(),inorder.begin() +index);
            vector<int> right(inorder.begin() +index+1,inorder.end());

            root->left=build(pre,left);
            root->right=build(pre,right);
            return root;
        }
        return nullptr;
    }
};
