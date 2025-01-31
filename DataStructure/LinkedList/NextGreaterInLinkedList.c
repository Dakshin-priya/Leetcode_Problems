class Solution {
public:
    vector<int> nextLargerNodes(ListNode* head) {
        vector<int> ans;
        ListNode*temp=head;
        while(temp!=NULL)
        {
            ListNode*head1=temp->next;
            int value=temp->val;
            int flag=0;
            while(head1!=NULL)
            {
                if(head1->val>value)
                {
                    ans.push_back(head1->val);
                    flag=1;
                    break;
                }
                else 
                    head1=head1->next;
            }
            if(flag==0)
                ans.push_back(0);
            temp=temp->next;
        }
        return ans;
    }
};
