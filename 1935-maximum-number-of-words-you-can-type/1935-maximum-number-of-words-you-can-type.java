class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String [] words = text.split(" ");
        int output = 0;

        for(String word : words){
        boolean canType = true;
          for(char c : word.toCharArray()){
            if(brokenLetters.indexOf(c)!= -1){
                 canType = false;
                 break;
            }
          }
          if(canType){
            output +=1;
          } 
        }
        return output;
    }  
}