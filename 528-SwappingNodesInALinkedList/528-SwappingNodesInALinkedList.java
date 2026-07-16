// Last updated: 2026. 7. 16. 오전 11:26:42
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        for (int i=0; i<k-1; ++i) {
            left = left.next;
        }
        
        ListNode node = left.next;
        ListNode right = head;
        while (node != null) {
            node = node.next;
            right = right.next;
        }
        
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        
        return head;
    }
}