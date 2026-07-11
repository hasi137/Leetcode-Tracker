// Last updated: 11/07/2026, 12:30:59
class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        
        for (int i = 0; i < m; i++) {
            char[] row = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = '#';
            }
            
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    row[j] = '.';
                }
            } else {
                row[n - 1] = '.';
            }
            
            res[i] = new String(row);
        }
        
        return res;
    }
}