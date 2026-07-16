// Last updated: 2026. 7. 16. 오전 11:28:44
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode node = dummy;
        
        while (node.next != null && node.next.next != null) {
            ListNode temp = node.next;
            node.next = node.next.next;
            temp.next = node.next.next;
            node.next.next = temp;
            node = node.next.next;
            
        }
        
        return dummy.next;
    }
}