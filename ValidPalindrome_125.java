import java.util.regex.*;
public class Solution {
    public boolean isPalindrome(String s) {
     String strPattern = "[a-zA-Z0-9]+";
     StringBuilder sbuilder = new StringBuilder();
     Pattern p = Pattern.compile(strPattern);
     Matcher m = p.matcher(s);
     while(m.find()){
         sbuilder.append(m.group());
     }
     String str = sbuilder.toString().toLowerCase();
     if(str.length()==0) return true;
     char[] ch = str.toCharArray();
     for(int i=0;i<=(int)(ch.length/2);i++){
             if(ch[i]!=ch[ch.length-1-i]) return false;
         }
     return true;
    }
}
