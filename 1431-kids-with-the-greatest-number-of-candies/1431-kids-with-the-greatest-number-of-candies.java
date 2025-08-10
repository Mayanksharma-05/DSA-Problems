class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        for(int candy: candies){
            maxCandy = Math.max(candy, maxCandy);
        }
        for(int i = 0;i<candies.length;i++){
            if(candies[i] + extraCandies >= maxCandy){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }
}