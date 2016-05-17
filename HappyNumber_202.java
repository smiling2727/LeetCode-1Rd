public class Solution {
    public boolean isHappy(int n) {
            for(int j =0;j<100;j++){
            ArrayList<Integer> d = toDigit(n);
            n=0;
            for(int i=0;i<d.size();i++){
                n = n + d.get(i)*d.get(i);
            }
            if(n==1){
                return true;
            }
        }
        return false;
    }
    public  ArrayList<Integer> toDigit(int n){
        String str = String.valueOf(n);
        char[] ch  = str.toCharArray();
        ArrayList<Integer> digits = new ArrayList<Integer>();
        for(int i =0;i<ch.length;i++){
            digits.add(Integer.parseInt(String.valueOf(ch[i])));
        }
        return digits;
    }
}
