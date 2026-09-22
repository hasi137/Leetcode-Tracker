// Last updated: 22/09/2026, 10:23:34
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
12    public ListNode oddEvenList(ListNode head) {
13        if (head == null || head.next == null)
14            return head;
15
16        ListNode odd = head;
17        ListNode even = head.next;
18        ListNode evenHead = even;
19
20        while (even != null && even.next != null) {
21            odd.next = even.next;
22            odd = odd.next;
23
24            even.next = odd.next;
25            even = even.next;
26        }
27
28        odd.next = evenHead;
29
30        return head;
31    }
32}