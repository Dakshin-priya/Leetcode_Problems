class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int len = length(head); // Get the length of the list
        int pos = len - n;      // Calculate the position to remove
        ListNode* temp = head;

        // Edge case: Removing the head
        if (pos == 0) {
            ListNode* toDelete = head;
            head = head->next; // Update the head  // Free memory
            return head;
        }

        // Traverse to the node just before the one to remove
        for (int i = 0; i < pos - 1; ++i) {
            temp = temp->next;
        }

        // Remove the nth node from the end
        temp->next = temp->next->next; // Skip the node to be deleted               // Free memory

        return head;
    }

    // Helper function to calculate the length of the list
    int length(ListNode* head) {
        int count = 0;
        while (head != nullptr) {
            ++count;
            head = head->next;
        }
        return count;
    }
};

