// Last updated: 2026. 7. 16. 오전 11:29:08
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        ListNode dummy = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;

            int sum = carry + value1 + value2;

            carry = sum / 10;

            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }

        return result.next;
    }
}