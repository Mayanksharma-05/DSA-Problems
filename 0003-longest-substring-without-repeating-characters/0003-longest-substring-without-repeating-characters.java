class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int maxLen = 0;
        HashSet<Character> st = new HashSet<>();

        for (int j = 0; j < s.length(); j++) {
            while (st.contains(s.charAt(j))) {
                st.remove(s.charAt(i));
                i++;
            }

            st.add(s.charAt(j));
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;       
    }
}