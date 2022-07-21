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
        if(head==null||head.next==null)
            return head;
        ListNode mid=findMid(head);
        ListNode midnext=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(midnext);
        return mergeTwoSortedList(left,right);
    }
    public ListNode findMid(ListNode head){
        if(head==null)
            return head;
        ListNode fast=head.next,slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode mergeTwoSortedList(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cur.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                cur.next=new ListNode(l2.val);
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1!=null)
            cur.next=l1;
        else
            cur.next=l2;
        return dummy.next;
    }
    
}