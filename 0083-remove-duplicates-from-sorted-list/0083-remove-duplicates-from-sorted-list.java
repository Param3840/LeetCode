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
        if(head==null){
            return null;
        }
        HashSet<Integer> mp=new HashSet<>();
        ListNode temp=head;
        mp.add(temp.val);

        while(temp.next!=null){
            if(mp.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else{
                mp.add(temp.next.val);
                temp=temp.next;
            }
        }
        return head;
    }
}