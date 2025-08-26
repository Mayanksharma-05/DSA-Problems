class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        findSum(n, k,new ArrayList<Integer>(),0,0);
        return ans;
    }
    void findSum(int n , int k , ArrayList<Integer> temp, int i , int sum){
        if(temp.size() == k){
           if(sum == n){
            ans.add(new ArrayList<>(temp));
           }
           return;
        }
        for(int j = i+1;j<10;j++){
            temp.add(j);
            findSum(n,k,temp,j,sum+j);
            temp.remove(temp.size()-1);
        }
    }
}