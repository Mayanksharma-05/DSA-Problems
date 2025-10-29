class Solution {
    public int smallestNumber(int n) {
        int bits =0;
        while(n>0){
         n=n>>1;
         bits++;
        }
        return (1<<bits)-1;
    }
}