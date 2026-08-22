// Last updated: 22/08/2026, 09:09:17
1import java.util.*;
2
3class Solution {
4    public int numUniqueEmails(String[] emails) {
5        HashSet<String> set = new HashSet<>();
6
7        for (String email : emails) {
8            String[] parts = email.split("@");
9            String local = parts[0];
10            String domain = parts[1];
11
12            if (local.contains("+"))
13                local = local.substring(0, local.indexOf("+"));
14
15            local = local.replace(".", "");
16
17            set.add(local + "@" + domain);
18        }
19
20        return set.size();
21    }
22}