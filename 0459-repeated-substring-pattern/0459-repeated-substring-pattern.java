class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = 0;i<len/2;i++){
            String subString = s.substring(0,i+1);
            if(len % subString.length()==0);{
            int noOfRepetation = len/subString.length();
            StringBuilder sb = new StringBuilder();
            while(noOfRepetation>0){
                 sb.append(subString);
            noOfRepetation--;
            }
            if(sb.toString().equals(s)){
                     return true;
            }
        }
        }
        return false;
    }
}