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
    public ListNode reverseList(ListNode head) {
        ListNode p,c,n;
        if(head==null) return null;
        p=null;c=null;n=head;
        while(n!=null){
            c=n;
            n=n.next;
            c.next=p;
            p=c;
        }
        head=p;
        return head;
    }
}