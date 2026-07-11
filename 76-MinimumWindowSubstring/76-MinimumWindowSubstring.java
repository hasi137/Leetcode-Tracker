// Last updated: 11/07/2026, 12:39:25
import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int left = 0, start = 0, minLen = Integer.MAX_VALUE;
        int need = t.length();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                if (map.get(c) > 0) need--;
                map.put(c, map.get(c) - 1);
            }

            while (need == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                if (map.containsKey(l)) {
                    map.put(l, map.get(l) + 1);
                    if (map.get(l) > 0) need++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}