import java.util.regex.*;
public class Solution {
    public boolean isPalindrome(String s) {
     String strPattern = "[^a-zA-Z0-9]+";
     Matcher m = Pattern.compile(strPattern).matcher(s);
     String str = m.replaceAll("").toLowerCase();
     if(str.length()==0) return true;
     char[] ch = str.toCharArray();
     for(int i=0;i<=ch.length/2;i++){
             if(ch[i]!=ch[ch.length-1-i]) return false;
         }
     return true;
    }
}
