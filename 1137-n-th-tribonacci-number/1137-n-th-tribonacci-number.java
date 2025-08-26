class Solution {
    public int tribonacci(int n) {
        if(n==0|| n==1) return n;
        if(n==2) return 1;
        int first =0;
        int second = 1;
        int third = 2;
        int i = 3;
        while(i++<=n){
            int temp = third;
            third += first +second;
            first = second;
            second = temp;
        }
        return third;
    }
}