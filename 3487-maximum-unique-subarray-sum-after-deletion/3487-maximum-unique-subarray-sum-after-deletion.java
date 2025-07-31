class Solution {
    public int maxSum(int[] nums) {
       Set <Integer> uniquevalue = new HashSet<>();
       int result = 0;
       int SmallestNegativeNo = Integer.MIN_VALUE;

       for(int num : nums){
          if(num>0){
          uniquevalue.add(num);  
          }
          else{
          SmallestNegativeNo = Math.max(SmallestNegativeNo,num);
          }
       }
       for(int num:uniquevalue){
        result+=num;
       }

      return result==0? SmallestNegativeNo: result;
    }
}