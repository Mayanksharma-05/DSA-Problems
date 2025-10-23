class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedKeys = new ArrayList<>(freqMap.keySet());
        sortedKeys.sort((a, b) -> Integer.compare(freqMap.get(b), freqMap.get(a)));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sortedKeys.get(i);
        }

        return result;
    }
}
