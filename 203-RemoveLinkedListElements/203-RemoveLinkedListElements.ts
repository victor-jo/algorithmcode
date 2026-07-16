// Last updated: 2026. 7. 16. 오전 11:27:24
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function removeElements(head: ListNode | null, val: number): ListNode | null {
    let dummy = new ListNode(null, head);
    let curr = dummy;

    while (curr.next != null) {
        if (curr.next.val === val) curr.next = curr.next.next;
        else curr = curr.next;
    }

    return dummy.next;
};