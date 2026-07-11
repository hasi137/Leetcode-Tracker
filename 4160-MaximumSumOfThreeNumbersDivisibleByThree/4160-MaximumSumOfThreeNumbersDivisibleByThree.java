// Last updated: 11/07/2026, 12:31:15
class Solution {
    public int maximumSum(int[] nums) {
        int[] r0 = new int[3]; 
        int[] r1 = new int[3]; 
        int[] r2 = new int[3]; 
        for (int i = 0; i < 3; i++) r0[i] = r1[i] = r2[i] = -1;
        for (int num : nums) {
            int rem = num % 3;
            int[] arr = (rem == 0) ? r0 : (rem == 1) ? r1 : r2;
            for (int i = 0; i < 3; i++) {
                if (num > arr[i]) {
                    for (int j = 2; j > i; j--) arr[j] = arr[j - 1];
                    arr[i] = num;
                    break;
                }
            }
        }
        int maxSum = 0;
        if (r0[2] != -1) maxSum = Math.max(maxSum, r0[0] + r0[1] + r0[2]);
        if (r1[2] != -1) maxSum = Math.max(maxSum, r1[0] + r1[1] + r1[2]);
        if (r2[2] != -1) maxSum = Math.max(maxSum, r2[0] + r2[1] + r2[2]);
        if (r0[0] != -1 && r1[0] != -1 && r2[0] != -1) 
            maxSum = Math.max(maxSum, r0[0] + r1[0] + r2[0]);
        return maxSum;
    }
}
