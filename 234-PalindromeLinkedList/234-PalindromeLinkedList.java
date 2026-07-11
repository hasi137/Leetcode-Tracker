// Last updated: 11/07/2026, 12:37:09
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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            curr = curr.next;
            fast = fast.next.next;

        }
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while(prev!=null && head!=null){
            if(prev.val!=head.val){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;


        
    }
}