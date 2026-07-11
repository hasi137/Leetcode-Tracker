// Last updated: 11/07/2026, 12:36:25
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";  
        char[] map = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        while (num != 0) {
            int d =num & 15;
            sb.append(map[d]); 
            num >>>= 4; 
        }
        
        return sb.reverse().toString();
    }
}
