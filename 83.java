/**
 * Definition for singly-linked list.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null) {
            if (current.next.val == current.val) {å
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
