class Solution {
    public int countHillValley(int[] nums) {
        int count =0;
        int n = nums.length;
        for(int i = 1; i<n-1;i++){
            if(nums[i]==nums[i-1]) continue;
            int j=i-1, k=i+1;
            while(k<n && nums[i]==nums[k]) k++;
            while(j>=0 &&  nums[i]==nums[j]) j--;

            if(k>=n || j<0) continue;
            
            if(nums[k]>nums[i] && nums[j]>nums[i]) count++;
            if(nums[k]<nums[i] && nums[j]<nums[i]) count++;
        }
        return count;
    }
}