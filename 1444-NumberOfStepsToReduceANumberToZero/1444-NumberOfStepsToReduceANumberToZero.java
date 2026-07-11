// Last updated: 11/07/2026, 12:33:55
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++; 
        }
        return steps;
    }
};

  