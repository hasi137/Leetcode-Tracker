// Last updated: 13/10/2026, 15:44:21
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
11
12class Solution {
13    public ListNode removeNodes(ListNode head) {
14        head = reverse(head);
15
16        int max = 0;
17        ListNode curr = head;
18        ListNode prev = null;
19
20        while (curr != null) {
21            if (curr.val >= max) {
22                max = curr.val;
23                prev = curr;
24            } else {
25                prev.next = curr.next;
26            }
27            curr = curr.next;
28        }
29
30        return reverse(head);
31    }
32
33    public ListNode reverse(ListNode head) {
34        ListNode prev = null;
35        ListNode curr = head;
36
37        while (curr != null) {
38            ListNode next = curr.next;
39            curr.next = prev;
40            prev = curr;
41            curr = next;
42        }
43
44        return prev;
45    }
46}
47