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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode before=dummy;
        ListNode dummy2=new ListNode(-1);
        ListNode after=dummy2;
        while(head!=null){
            if(head.val<x){
                before.next=head;
                before=before.next;
            }
            else{
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        after.next=null;
        before.next=dummy2.next;
        return dummy.next;
        
    }
}