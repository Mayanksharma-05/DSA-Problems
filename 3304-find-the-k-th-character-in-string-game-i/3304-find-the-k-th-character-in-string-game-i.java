class Solution {
    public char kthCharacter(int k) {
        String s ="a";
        while(true){
            String t ="";
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                ch++;
                t+=ch;
            } 
            s+=t;
            if(s.length()>=k) break;
        }
        return s.charAt(k-1);
    }
}