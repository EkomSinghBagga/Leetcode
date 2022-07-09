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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=new ListNode(-1),to=odd;
        ListNode even=new ListNode(-1),te=even;
        int c=1;
        while(head!=null){
            if(c%2!=0){
                to.next=new ListNode(head.val);
                to=to.next;
            }
            else
            {
                te.next=new ListNode(head.val);
                te=te.next;
            }
            c++;
            head=head.next;
        }
        to.next=even.next;
        return odd.next;
    }
}