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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l=null,r=null,x=head;
        if(left==right)
            return head;
        if(head==null||head.next==null)
            return head;
        int c=1;
        if(left==1)
        {
            while(head!=null){
                if(c==right){
                    r=head;
                }
                c++;
                head=head.next;
               
            }
             ListNode nex=r.next;
            r.next=null;
            ListNode newhead=reverseList(x),cur=newhead;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=nex;
            return newhead;
             
        }
        while(head!=null){
           if(c==left-1)
               l=head;
            if(c==right)
                r=head;
            c++;
            head=head.next;
        }
        ListNode nex=r.next;
        r.next=null;
        ListNode newl=reverseList(l.next);
        l.next=newl;
        while(newl.next!=null){
            newl=newl.next;
        }
        newl.next=nex;
        return x;
    }
    public ListNode reverseList(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode pre=null,cur=head,next;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}