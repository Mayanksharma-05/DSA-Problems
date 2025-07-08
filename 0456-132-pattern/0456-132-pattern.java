class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;
        
        // Stack to keep track of potential 'j' values
        Stack<Integer> stack = new Stack<>();
        
        // This will track our potential 'k' value (the '2' in the 132 pattern)
        // Initially set to minimum possible value
        int potentialK = Integer.MIN_VALUE;
        
        // Traverse array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If current number is less than our potential 'k', we found a 132 pattern
            if (nums[i] < potentialK) {
                return true;
            }
            
            // Pop elements from stack and update potentialK
            // This helps find the largest value less than nums[i]
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                potentialK = stack.pop();
            }
            
            // Push current element to stack
            stack.push(nums[i]);
        }
        
        return false;
    }
}
