// Last updated: 11/07/2026, 12:37:16
class Solution {
    public List<Integer> majorityElement(int[] nums) {   
        HashMap <Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        int m = n/3;
        List<Integer> li = new ArrayList<>();
        for(Map.Entry<Integer, Integer> en : map.entrySet()){
            if(en.getValue() > m){
                li.add(en.getKey());
            }   
        }           
        return li;
    }
}