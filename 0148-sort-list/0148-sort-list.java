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
    public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) return head;

    List<Integer> vals = new ArrayList<>();
    ListNode temp = head;

    while (temp != null) {
        vals.add(temp.val);
        temp = temp.next;
    }

    Collections.sort(vals);

    temp = head;
    for (int val : vals) {
        temp.val = val;
        temp = temp.next;
    }

    return head;
}

}