class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> Map = new HashMap<>();
        for(int num : nums){
            Map.put(num, Map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> List = new ArrayList<>(Map.keySet());
        List.sort((a,b) -> Map.get(b) - Map.get(a));

        int [] arr = new int[k];
        for(int i = 0;i<k;i++){
            arr[i] = List.get(i);
        }
        return arr;
    }
}