class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<n-1;i++){
            if(s.charAt(i)==')'){
                count--;
            }
            if(count != 0){
                 sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                count++;
            }
        }
        return sb.toString();
    }
}