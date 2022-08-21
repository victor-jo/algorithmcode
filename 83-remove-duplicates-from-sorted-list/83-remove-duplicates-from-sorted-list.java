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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            while (cur != null && pre.val == cur.val) {
                pre.next = cur.next;
                cur = cur.next;
            }
            if (cur != null) {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}