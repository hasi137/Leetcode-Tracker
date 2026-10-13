// Last updated: 13/10/2026, 15:45:24
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
13    public ListNode modifiedList(int[] nums, ListNode head) {
14        boolean[] remove = new boolean[100001];
15
16        for (int x : nums) {
17            remove[x] = true;
18        }
19
20        ListNode dummy = new ListNode(0);
21        dummy.next = head;
22        ListNode curr = dummy;
23
24        while (curr.next != null) {
25            if (remove[curr.next.val]) {
26                curr.next = curr.next.next;
27            } else {
28                curr = curr.next;
29            }
30        }
31
32        return dummy.next;
33    }
34}
35