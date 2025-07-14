class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        int pre = 0;
        HashMap<Integer ,Integer> map = new HashMap();
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            pre += nums[i];
            res += map.getOrDefault(pre-goal,0);
            map.put(pre, map.getOrDefault(pre,0)+1);
        }
        return res;
    }
}