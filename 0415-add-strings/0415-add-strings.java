class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder res = new StringBuilder();
        int c = 0, base = 10;
        
        while (i >= 0 || j >= 0) {
            int s = 0, s1 = 0, s2 = 0;
            if (i >= 0) {
                s1 = num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                s2 = num2.charAt(j--) - '0';
            }
            s = s1 + s2 + c;
            if (s >= base) {
                c = 1;
                s = s - base;
            } else {
                c = 0;
            }
            res.append(s);  
        }

        if (c == 1)  
            res.append(c);

        return res.reverse().toString(); 
    }
}
