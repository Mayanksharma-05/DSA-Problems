class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet <Integer> sb = new HashSet<>();
        for(int i=0;i<n;i++){
           if(sb.contains(nums[i])){
             return true;
           }
           sb.add(nums[i]);
        }
        return false;
    }
}