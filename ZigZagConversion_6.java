public class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0||numRows < 2) return s;
        char[] sch = s.toCharArray();
        int index = 0;
        StringBuilder sbd = new StringBuilder();
        for(int row =0;row<numRows;row++){
            if(row==0||row==numRows-1){
                for(int i = row;i<s.length();i=i+2*(numRows-1)){
                    sbd.append(s.charAt(i));
                }
            }
            else{
                int i = row;
                int col = 0;
                while(i<s.length()){
                    sbd.append(s.charAt(i));
                    col++;
                    if(col%2==1){
                        i=i+2*(numRows-row-1);
                    }
                    else{
                       i=i+2*row; 
                    }
                }
            }
        }
        return sbd.toString();
    }
}
