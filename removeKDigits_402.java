public class Solution {
    public String removeKdigits(String num, int k) {
        int counter = 0;
        String num1 = helper(num,k);
       // if(num1.length()==0) return "0";
        char[] ch = num1.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0') break;
            counter++;
        }
        String num2 = num1.substring(counter,num1.length());
        if(num2.length()==0) return "0";
        return num2;
    }
    private String helper(String num, int k){
        int length = num.length();
        if(length<=k) return "";
        //if (length==0||k==length) return null;
        if (k==0) return num;
        char min = num.charAt(0); 
        int minIndex  = 0;
        char[] ch = num.toCharArray();
        //for(int i=0;i<length-k;i++){
        for(int i=0;i<=k;i++){
            if(ch[i]<min){
                min = ch[i];
                minIndex = i;
            }
        }
       //String num2 =  helper(num.substring(minIndex+1,length),k-1);
       String num2 =  helper(num.substring(minIndex+1,length),k-minIndex);
       return num.charAt(minIndex)+num2;
    }
}
