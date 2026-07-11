// Last updated: 11/07/2026, 12:38:14
class Solution {
    public int titleToNumber(String s) {       
        int result =0;
        for( int i =0;i <s.length();i++){
            char c = s.charAt(i);
            result = (result*26) + c -'A' + 1;
        }
        return result;

    }
}