// Last updated: 04/10/2026, 21:22:15
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        
14        while (head != null && head.val == val) {
15            head = head.next;
16        }
17
18        ListNode curr = head;
19
20        while (curr != null && curr.next != null) {
21            if (curr.next.val == val) {
22                curr.next = curr.next.next;
23            } else {
24                curr = curr.next;
25            }
26        }
27
28        return head;
29    }
30}