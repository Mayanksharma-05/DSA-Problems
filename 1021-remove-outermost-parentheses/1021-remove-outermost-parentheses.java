class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
      String a = "";

        for(int i = 0;i<n-1;i++){
            if(s.charAt(i)==')'){
                count--;
            }
            if(count != 0){
                 a+= s.charAt(i);
            }
            if(s.charAt(i)=='('){
                count++;
            }
        }
        return a;
    }
}