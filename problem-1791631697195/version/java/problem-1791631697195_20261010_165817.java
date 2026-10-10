// Last updated: 10/10/2026, 16:58:17
1class WordFilter {
2    String[] words;
3
4    public WordFilter(String[] words) {
5        this.words = words;
6    }
7
8    public int f(String pref, String suff) {
9        for (int i = words.length - 1; i >= 0; i--) {
10            if (words[i].startsWith(pref) && words[i].endsWith(suff))
11                return i;
12        }
13        return -1;
14    }
15}
16/**
17 * Your WordFilter object will be instantiated and called as such:
18 * WordFilter obj = new WordFilter(words);
19 * int param_1 = obj.f(pref,suff);
20 */