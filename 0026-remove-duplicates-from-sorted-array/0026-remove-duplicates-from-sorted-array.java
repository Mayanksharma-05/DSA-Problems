class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i =0;
        int j = 1;
        int k = 1;

        while(j < len){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                nums[k] = nums[j];
                k++;
                i++;
                j++;
            }
        }
        return i+1;
    }
}