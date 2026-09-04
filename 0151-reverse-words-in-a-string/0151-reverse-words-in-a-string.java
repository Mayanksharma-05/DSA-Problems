class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        StringBuilder ab = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
            ab.append(arr[i]);
            if(i!=0){
                ab.append(" ");
            }
            
        }
        return ab.toString();
    }
}