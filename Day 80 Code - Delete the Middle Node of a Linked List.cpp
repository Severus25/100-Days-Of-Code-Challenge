// Problem Statement:
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

// Problem Solution:
class Solution {
public:
	ListNode* deleteMiddle(ListNode* head) {
		   if(head->next==nullptr) return nullptr;
		   ListNode *f=head;
		   ListNode *s=head,*prev;
		  while(f!=nullptr && f->next!=nullptr){
			  f=f->next->next;
			  prev=s;
			  s=s->next;
		  }
		prev->next=prev->next->next;
		return head;
	}
};
