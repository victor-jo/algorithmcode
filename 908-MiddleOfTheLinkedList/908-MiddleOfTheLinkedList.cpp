// Last updated: 2026. 7. 16. 오전 11:26:20
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* entry = head;
        int length = 0;
        while (entry) {
            ++length;
            entry = entry->next;
        }
        length /= 2;
        while (length--) {
            head = head->next;
        }
        return head;
    }
};