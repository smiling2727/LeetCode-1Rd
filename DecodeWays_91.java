public class Solution {
    public int numDecodings(String s) {
        if(s.length()==0||Integer.parseInt(s.charAt(0)+"")<1) return 0;
        if(s.length()==1) return 1;
        if(Integer.parseInt(s.charAt(s.length()-1)+"")==0){
            int last2 = Integer.parseInt(s.charAt(s.length()-2)+"");
            if(last2>2||last2<1)return 0;
            if(last2==2||last2==1)return helper(s.substring(0,s.length()-2),1,false);;
        }
        return helper(s,1,false);
    }
    private int helper(String s,int count,boolean isTwo){
        if(s.length()<2) return count;
        int num = Integer.parseInt(s.substring(0,2));
        if(num==0||(num>26&&num%10==0)) return 0;
        if(num>10&&num<=26&&num%10!=0) {
            if(isTwo) return helper(s.substring(1,s.length()),count*2-1,true);
            else return helper(s.substring(1,s.length()),count*2,true);
        } 
        else return helper(s.substring(1,s.length()),count,false);//if first 2 >26
        //return count;
    }
}
