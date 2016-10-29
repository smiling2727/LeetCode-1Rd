public class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0||numRows < 2) return s;
        char[] sch = s.toCharArray();
        char[][] ch = new char[s.length()][numRows];
        int index = 0;
        StringBuilder sbd = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (index < s.length()) {
                        ch[i][j] = sch[index];
                        index++;
                    }
                }
            } else {
                    for (int j = numRows-2; j >0 ; j--) {
                        if (index < s.length()) {
                            ch[i][j] = sch[index];
                            index++;}}}}

        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < s.length(); i++) {
                if (ch[i][j] != '\0') sbd.append(ch[i][j]);
            }
        }
        return sbd.toString();
    }
}
