public class Solution {
    public int addDigits(int num) {
       int n = num;
       while((n/10)>0){
       String str =  String.valueOf(n);
       char[] ch = str.toCharArray();
       for(int i=0;i<ch.length;i++){
           n = n+Integer.parseInt(String.valueOf(ch[i]));
            }
        }
       return n;
    }
}
