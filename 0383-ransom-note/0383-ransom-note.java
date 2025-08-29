class Solution {
    public boolean canConstruct(String a, String b) {
       int [] count = new int[26];
       
       for(char ch:b.toCharArray()){
           count[ch-'a']++;
        }
       for(char ch:a.toCharArray()){
           count[ch-'a']--;
       if(count[ch-'a']<0)
       return false;
       }
       return true;
    }    
}