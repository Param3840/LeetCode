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
    public ListNode rotateRight(ListNode head, int k) {
          if (head == null || head.next == null || k == 0) return head;
          ListNode tail=head;
          int size=1;
          while (tail.next!=null){
              size++;
              tail=tail.next;
          }

          k=k%size;
          if (k==0) return head;

          tail.next=head;

          int stepToHead=size-k;
          ListNode temp=head;
          for (int i=1;i<stepToHead;i++){
              temp=temp.next;
          }
          ListNode newHead=temp.next;
          temp.next=null;
          return newHead;
    }
}