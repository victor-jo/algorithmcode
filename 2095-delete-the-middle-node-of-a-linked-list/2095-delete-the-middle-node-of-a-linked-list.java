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
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        if (fast == null) {
            return null;
        }
        
        while (fast != null) {
            dummy = dummy.next;
            slow = slow.next;
            fast = fast.next != null ? fast.next.next : null;
        }
        
        dummy.next = slow.next;
        
        return head;
    }
}