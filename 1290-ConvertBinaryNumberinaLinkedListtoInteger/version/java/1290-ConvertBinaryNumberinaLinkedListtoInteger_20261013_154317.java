// Last updated: 13/10/2026, 15:43:17
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
13    public int getDecimalValue(ListNode head) {
14        int ans = 0;
15
16        while (head != null) {
17            ans = ans * 2 + head.val;
18            head = head.next;
19        }
20
21        return ans;
22    }
23}
24