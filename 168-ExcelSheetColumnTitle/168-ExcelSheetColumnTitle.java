// Last updated: 11/07/2026, 12:38:17
class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(n!=0){
            int d = --n %26;
            sb.append((char)(d + 65));
            n/=26;

        }
        return sb.reverse().toString();
        
    }
}