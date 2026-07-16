// Last updated: 2026. 7. 16. 오전 11:28:48
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode gap = head;
        ListNode prev = dummy;
        
        for (int i=0; i<n; ++i) {
            gap = gap.next;
        }
        
        while (gap != null) {
            gap = gap.next;
            prev = prev.next;
        }
        
        prev.next = prev.next.next;
        
        return dummy.next;
    }
}