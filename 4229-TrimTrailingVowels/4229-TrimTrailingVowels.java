// Last updated: 11/07/2026, 12:31:04
class Solution {
    public String trimTrailingVowels(String s) {
        int end = s.length() - 1;
        while(end >= 0){
            char ch = s.charAt(end);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                end--;
            }else{
                break;
            }
        }
        return s.substring(0, end +1);
        
    }
}