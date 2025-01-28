#include <stdlib.h>

int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    int* result = (int*)malloc(100 * sizeof(int)); 
    *returnSize = 0;

    void inorderHelper(struct TreeNode* node) {
        if (node == NULL) return;
        inorderHelper(node->left);                     
        result[(*returnSize)++] = node->val;           
        inorderHelper(node->right);                   
    }
    inorderHelper(root); 
    return result;
}

