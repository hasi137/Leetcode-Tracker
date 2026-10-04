// Last updated: 04/10/2026, 21:29:58
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
12    public void reorderList(ListNode head) {
13        if (head == null || head.next == null) {
14            return;
15        }
16
17        ListNode slow = head;
18        ListNode fast = head;
19
20        // Find middle
21        while (fast != null && fast.next != null) {
22            slow = slow.next;
23            fast = fast.next.next;
24        }
25
26        // Reverse second half
27        ListNode prev = null;
28        ListNode curr = slow.next;
29        slow.next = null;
30
31        while (curr != null) {
32            ListNode next = curr.next;
33            curr.next = prev;
34            prev = curr;
35            curr = next;
36        }
37
38        // Merge two halves
39        ListNode first = head;
40        ListNode second = prev;
41
42        while (second != null) {
43            ListNode next1 = first.next;
44            ListNode next2 = second.next;
45
46            first.next = second;
47            second.next = next1;
48
49            first = next1;
50            second = next2;
51        }
52    }
53}