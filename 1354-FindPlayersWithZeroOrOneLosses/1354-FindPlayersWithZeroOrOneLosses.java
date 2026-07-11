// Last updated: 11/07/2026, 12:34:09
import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        int[] loss = new int[100001];
        boolean[] played = new boolean[100001];

        Arrays.fill(loss, -1);

        for (int i = 0; i < matches.length; i++) {

            int w = matches[i][0];
            int l = matches[i][1];

            played[w] = true;
            played[l] = true;

            if (loss[w] == -1)
                loss[w] = 0;

            if (loss[l] == -1)
                loss[l] = 1;
            else
                loss[l]++;
        }

        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {

            if (played[i]) {

                if (loss[i] == 0)
                    zero.add(i);

                else if (loss[i] == 1)
                    one.add(i);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(zero);
        ans.add(one);

        return ans;
    }
}