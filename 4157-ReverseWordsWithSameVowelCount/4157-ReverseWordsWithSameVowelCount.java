// Last updated: 11/07/2026, 12:31:23
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int target = 0;
        for (char c : words[0].toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) target++;
        }
        for (int i = 1; i < words.length; i++) {
            int count = 0;
            for (char c : words[i].toCharArray()) {
                if ("aeiou".indexOf(c) >= 0) count++;
            }
            if (count == target) {
                char[] arr = words[i].toCharArray();
                for (int l = 0, r = arr.length - 1; l < r; l++, r--) {
                    char tmp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = tmp;
                }
                words[i] = new String(arr);
            }
        }

        return String.join(" ", words);
    }
}
