class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        
        // Scan from the rightmost side
        for (int i = n - 1; i >= 0; i--) {
            char c = num.charAt(i);
            int digit = c - '0'; // convert char to int
            if (digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        
        // No odd digit found
        return "";
    }
}
