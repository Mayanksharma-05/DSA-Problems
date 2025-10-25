class Solution {
    public int totalMoney(int n) {
        int w = n / 7;
        int r = n % 7;

        int weekSum = 7 * w * (w + 7) / 2;
        int start = w + 1;
        int remSum = r * (2 * start + (r - 1)) / 2;

        return weekSum + remSum;
    }
}