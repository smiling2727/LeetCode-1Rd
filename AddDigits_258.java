public class Solution {
    public int addDigits(int num) {
        int n = num;
        ArrayList<Integer> digits = new ArrayList<Integer>();
       while((n/10)>0){
        while ((n/10)>0){
            if((n/10)>=10){
                //int d = n%10;
                digits.add(n%10);
                n=n/10;
            }
            else if((n/10)<10){
                digits.add(n/10);
                n=n/10;
            }
        }
        
        for(int i =0;i<digits.size();i++){
            n=n+digits.get(i);
        }
       }
       return n;
    }
}
