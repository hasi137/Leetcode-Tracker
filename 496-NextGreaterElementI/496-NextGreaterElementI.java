// Last updated: 11/07/2026, 12:36:06
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1];
        for (int i = 0; i < n1; i++) {
            int num = nums1[i];
            res[i] = -1;  
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == num) {
                    for (int k = j + 1; k < n2; k++) {
                        if (nums2[k] > num) {
                            res[i] = nums2[k];
                            break;  
                        }
                    }

                    break;  
                }
            }
        }

        return res;
    }
}
