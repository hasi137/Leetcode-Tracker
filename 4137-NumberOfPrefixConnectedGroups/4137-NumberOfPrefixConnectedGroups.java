// Last updated: 11/07/2026, 12:31:28
import java.util.*;

class Solution {
    public int prefixConnected(String[] words, int k) {
        Arrays.sort(words); 
        int count = 0;
        int i = 0;
        while (i < words.length) {
            if (words[i].length() < k) {
                i++;
                continue;
            }
            int j = i + 1;
            int groupSize = 1;
            while (j < words.length &&
                   words[j].length() >= k &&
                   words[i].substring(0, k).equals(words[j].substring(0, k))) {
                groupSize++;
                j++;
            }
            if (groupSize >= 2) {
                count++;
            }
            i = j;
        }
    
        return count;
    }
}

