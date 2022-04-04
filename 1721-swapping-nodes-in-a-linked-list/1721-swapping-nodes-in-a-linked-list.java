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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        int c=0;
        while(first!=null&&c<k-1){
            c++;
            first=first.next;
        }
        // System.out.println(first.val);
        ListNode second=head,x=first.next;
        while(x!=null){
            second=second.next;
            x=x.next;
        }
        int t=first.val;
        first.val=second.val;
        second.val=t;
        return head;
    }
}