class Solution {
public:
    Node* connect(Node* root) {
        // If the tree is empty, return NULL
        if (root == nullptr) return nullptr;

        // Initialize a queue for level-order traversal
        queue<Node*> s;
        s.push(root);  // Start with the root node

        // Process each level of the tree one by one
        while (!s.empty()) {
            int size = s.size();  // Number of nodes at the current level
            Node* prev = nullptr; // Variable to track the previous node in the same level

            // Traverse all nodes at the current level
            for (int i = 0; i < size; i++) {
                Node* front = s.front();  // Get the front node from the queue
                s.pop();  // Remove it from the queue

                // If there's a previous node, link its `next` pointer to the current node
                if (prev) prev->next = front;
                prev = front;  // Update prev to the current node

                // Enqueue the left and right children if they exist
                if (front->left) s.push(front->left);
                if (front->right) s.push(front->right);
            }

            // The last node of each level should have `next` set to nullptr
            prev->next = nullptr;
        }

        // Return the root of the modified tree
        return root;
    }
};
