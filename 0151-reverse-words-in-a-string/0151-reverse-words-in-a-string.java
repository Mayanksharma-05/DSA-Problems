class Solution {
    public String reverseWords(String s) {
        String[] res = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = res.length - 1; i >= 0; i--) {
            sb.append(res[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
