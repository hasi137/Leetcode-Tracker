// Last updated: 11/07/2026, 12:31:40
class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int singleDigit = 0, doubleDigit = 0;
        for (int x:nums) {
            if(x<10) singleDigit+=x;
            else doubleDigit += x;
        }
        return doubleDigit!=singleDigit ? true:false;
    }
};