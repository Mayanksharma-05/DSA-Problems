class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int j = 0;
        int maxlength =0;

        for(int i=0;i<n;i++){
        while(nums[i]-nums[j]>1){
            j++;
        }
        if(nums[i]-nums[j]==1){
            maxlength=Math.max(i-j+1,maxlength);
        }
        }
        return maxlength;
    
        }     
   }