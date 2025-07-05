class Solution {
    public int findLucky(int[] arr) {

        int res[] = new int[501];
        for(int num:arr){
            res[num]++;
        }

        for(int i = 500; i>=1;i--){
            if(res[i]==i)
            return i;
        }
        return -1;
    }
}