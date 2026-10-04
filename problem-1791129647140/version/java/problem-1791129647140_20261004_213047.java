// Last updated: 04/10/2026, 21:30:47
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
11 class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        ListNode prev = dummy;
17        ListNode curr = head;
18
19        while (curr != null) {
20            boolean duplicate = false;
21
22            while (curr.next != null && curr.val == curr.next.val) {
23                curr = curr.next;
24                duplicate = true;
25            }
26
27            if (duplicate) {
28                prev.next = curr.next;
29            } else {
30                prev = prev.next;
31            }
32
33            curr = curr.next;
34        }
35
36        return dummy.next;
37    }
38}