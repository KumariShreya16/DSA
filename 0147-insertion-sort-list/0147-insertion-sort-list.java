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
    public ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {

            ListNode p = dummy;
            ListNode c = dummy.next;

            while (c != null && c.val < curr.val) {
                p = p.next;
                c = c.next;
            }

            ListNode next = curr.next;

            curr.next = c;
            p.next = curr;

            curr = next;
        }

        return dummy.next;
    }
}