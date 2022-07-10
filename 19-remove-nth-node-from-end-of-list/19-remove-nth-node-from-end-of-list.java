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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode fast=head,slow=head;
        int c=0;
        for(int i=0;fast!=null&&i<n+1;i++){
            c++;
            fast=fast.next;
        }
        if(c!=n+1) return head.next;
        while(fast!=null){
            c++;
            fast=fast.next;
            slow=slow.next;
        }
        if(c==n) return head.next;
        slow.next=slow.next.next;
        return head;
    }
}