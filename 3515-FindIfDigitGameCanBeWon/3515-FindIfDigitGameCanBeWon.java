// Last updated: 11/07/2026, 12:31:47
class Solution {
    public boolean canAliceWin(int[] nums){
        int single = 0, doubleDigit = 0;

        for (int n : nums) {
            if (n < 10) single += n;
            else doubleDigit += n;
        }

        int total = single + doubleDigit;
        boolean aliceSingle = single > total - single;

        boolean aliceDouble = doubleDigit > total - doubleDigit;
        return aliceSingle || aliceDouble;
    }
}

