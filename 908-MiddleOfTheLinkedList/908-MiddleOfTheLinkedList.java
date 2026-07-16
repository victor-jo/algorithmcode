// Last updated: 2026. 7. 16. 오전 11:26:17
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
    public ListNode middleNode(ListNode head) {
        ListNode tur = head;
        ListNode rab = head;
        while (rab != null && rab.next != null) {
            tur = tur.next;
            rab = rab.next.next;
        }
        return tur;
    }
}