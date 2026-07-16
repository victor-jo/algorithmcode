# Last updated: 2026. 7. 16. 오전 11:29:05
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        result = ListNode()
        curr = result

        carry = 0
        while l1 is not None or l2 is not None:
            v1 = l1.val if l1 is not None else 0
            v2 = l2.val if l2 is not None else 0

            sum = carry + v1 + v2
            carry = sum / 10

            curr.next = ListNode(sum % 10)
            curr = curr.next

            l1 = l1.next if l1 is not None else None
            l2 = l2.next if l2 is not None else None

        if carry > 0:
            curr.next = ListNode(carry)

        return result.next