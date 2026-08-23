// Last updated: 23/08/2026, 09:09:29
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper){
3        List<List<Integer>> ans = new ArrayList<>();
4        Set<Integer>set = new HashSet<>();
5        for(int x : nums){
6            set.add(x);
7        }
8        int start = -1;
9        for(int i = lower; i<=upper;i++){
10            if(!set.contains(i) && start == -1){
11                start = i;
12            }
13            if(set.contains(i) && start != - 1){
14                ans.add(Arrays.asList(start, i -1));
15                start = -1;
16            }
17        }
18        if(start != -1){
19            ans.add(Arrays.asList(start, upper));
20        }
21        return ans;
22        
23    } 
24        
25}