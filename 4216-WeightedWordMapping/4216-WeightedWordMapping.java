// Last updated: 11/07/2026, 12:31:06
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            int total = 0;
            
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                total += weights[ch - 'a'];
            }
            
            int mod = total % 26;
            char mapped = (char) ('z' - mod);
            
            result.append(mapped);
        }
        
        return result.toString();
    }
}
