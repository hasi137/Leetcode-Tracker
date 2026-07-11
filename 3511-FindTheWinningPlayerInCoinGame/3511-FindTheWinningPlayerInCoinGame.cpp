// Last updated: 11/07/2026, 12:31:42
class Solution {
public:
    string winningPlayer(int x, int y) {
        int turn=1;
        while(x>=1 && y>=4){
            x-=1;
            y-=4;
            turn++;
        }
         if(turn%2==0) return "Alice";
         else return "Bob";
        
    }
};