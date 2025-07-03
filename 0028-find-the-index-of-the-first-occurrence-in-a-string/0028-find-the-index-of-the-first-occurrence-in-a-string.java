class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();

        for (int i = 0; i <= haystack.length() - len; i++) {
            String part = haystack.substring(i, i + len);

            if (part.equals(needle)) {
                return i; // Found match at index i
            }
        }

        return -1; // No match found
    }
}
