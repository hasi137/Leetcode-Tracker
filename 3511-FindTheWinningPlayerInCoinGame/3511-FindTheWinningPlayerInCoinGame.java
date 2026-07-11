// Last updated: 11/07/2026, 12:31:50
class Solution {
    public String winningPlayer(int x, int y) {
        int turns = (x < y / 4) ? x : (y / 4);
        return (turns % 2 == 1) ? "Alice" : "Bob";
    }
}

    