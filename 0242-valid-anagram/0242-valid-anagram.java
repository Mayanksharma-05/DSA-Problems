class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sp = new StringBuilder(t);

        char[] A = sb.toString().toCharArray();
        char[] B = sp.toString().toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);
        
        StringBuilder P = new StringBuilder(new String(A));
        StringBuilder S = new StringBuilder(new String(B));

        if(P.length()!= S.length()){
            return false;
        }
     
        for(int i = 0; i<P.length();i++){
            if(P.charAt(i)!= S.charAt(i))
            return false;
        }
        return true;
          
        }
}