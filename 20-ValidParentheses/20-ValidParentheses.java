// Last updated: 11/07/2026, 12:40:47
class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character>st = new Stack<>();
        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            if( c == '(' || c =='{' || c =='['){
                st.push(c);
            }else{

                if(st.isEmpty()) return false;

                char top = st.pop();
                if(( c == ')' && top!= '(' ) || (c == '}' && top!= '{') || (c == ']' && top!= '['))return false;
            }    
        }   
        return st.isEmpty();
        
    }
}