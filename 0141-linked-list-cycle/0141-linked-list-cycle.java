/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        if(temp==null){
            return false;
        }
        HashSet<ListNode> st=new HashSet<>();
        while(temp!=null){
            if(st.contains(temp)){
                return true;
            }
            st.add(temp);
            temp=temp.next;
        }
        return false;
    }
}