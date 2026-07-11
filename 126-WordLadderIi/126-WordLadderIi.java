// Last updated: 11/07/2026, 12:38:42
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        Set<String> dict = new HashSet<>(wordList);
        List<List<String>> res = new ArrayList<>();
        if (!dict.contains(endWord)) return res;

        Map<String, List<String>> map = new HashMap<>();
        Set<String> curr = new HashSet<>();
        curr.add(beginWord);

        boolean found = false;

        while (!curr.isEmpty() && !found) {
            Set<String> next = new HashSet<>();
            dict.removeAll(curr);

            for (String word : curr) {
                char[] arr = word.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    char old = arr[i];

                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[i] = c;
                        String newWord = new String(arr);

                        if (!dict.contains(newWord)) continue;

                        next.add(newWord);

                        map.computeIfAbsent(newWord, k -> new ArrayList<>()).add(word);

                        if (newWord.equals(endWord)) found = true;
                    }
                    arr[i] = old;
                }
            }
            curr = next;
        }

        backtrack(res, new ArrayList<>(), map, endWord, beginWord);
        return res;
    }

    void backtrack(List<List<String>> res, List<String> path,
                   Map<String, List<String>> map,
                   String word, String beginWord) {

        if (word.equals(beginWord)) {
            path.add(0, beginWord);
            res.add(new ArrayList<>(path));
            path.remove(0);
            return;
        }

        path.add(0, word);

        if (map.containsKey(word)) {
            for (String prev : map.get(word)) {
                backtrack(res, path, map, prev, beginWord);
            }
        }

        path.remove(0);
    }
}