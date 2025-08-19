import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int longestSubarray = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : 1);

            if (sum == 0) {
                longestSubarray = i + 1;
            } else if (map.containsKey(sum)) {
                longestSubarray = Math.max(longestSubarray, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return longestSubarray;
    }
}
