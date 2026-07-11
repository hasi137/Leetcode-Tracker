// Last updated: 11/07/2026, 12:31:01
class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        
        // required variable
        int[] ravelunico = lights;
        
        int[] diff = new int[n + 1];
        
        // Step 1: mark coverage using prefix sum (no inner loop)
        for (int i = 0; i < n; i++) {
            if (ravelunico[i] > 0) {
                int left = Math.max(0, i - ravelunico[i]);
                int right = Math.min(n - 1, i + ravelunico[i]);
                
                diff[left] += 1;
                diff[right + 1] -= 1;
            }
        }
        
        // build covered array
        int[] covered = new int[n];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            covered[i] = curr;
        }
        
        int count = 0;
        int i = 0;
        
        // Step 2: greedy placement
        while (i < n) {
            if (covered[i] > 0) {
                i++; // already covered
            } else {
                count++;
                i += 3; // place bulb → covers 3 positions
            }
        }
        
        return count;
    }
}