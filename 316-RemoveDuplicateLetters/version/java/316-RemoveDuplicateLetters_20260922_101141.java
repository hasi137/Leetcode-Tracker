// Last updated: 22/09/2026, 10:11:41
1import java.util.*;
2
3class Solution {
4    public String removeDuplicateLetters(String s) {
5        int[] last = new int[26];
6        
7        for (int i = 0; i < s.length(); i++)
8            last[s.charAt(i) - 'a'] = i;
9        
10        Stack<Character> stack = new Stack<>();
11        boolean[] used = new boolean[26];
12        
13        for (int i = 0; i < s.length(); i++) {
14            char ch = s.charAt(i);
15            
16            if (used[ch - 'a'])
17                continue;
18            
19            while (!stack.isEmpty() &&
20                   stack.peek() > ch &&
21                   last[stack.peek() - 'a'] > i) {
22                
23                used[stack.pop() - 'a'] = false;
24            }
25            
26            stack.push(ch);
27            used[ch - 'a'] = true;
28        }
29        
30        String ans = "";
31        
32        while (!stack.isEmpty())
33            ans = stack.pop() + ans;
34        
35        return ans;
36    }
37}