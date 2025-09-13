class Solution {
    public int maxFreqSum(String s) {
        int [] freq = new int[26];
        for(char c :s.toCharArray()){
            freq[c - 'a']++;
        }

        String vowels = "aeiou";
        int maxVowels = 0;
        int maxConsonants = 0;

        for(int i =0;i<freq.length;i++){
            int current = (char)('a'+i);
            int f = freq[i];
            if(f==0)continue;

             if(vowels.indexOf(current)!=-1){
            if(f>maxVowels){
                   maxVowels=f;
                }
          }
            else{
                if(f>maxConsonants){
                    maxConsonants=f;
                }
            } 
        }
        return maxVowels + maxConsonants; 
        } 
    }