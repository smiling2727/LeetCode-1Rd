public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer> ();
            if(n==1){
                return true;
            }
            while(n!=1){
            n = getSum(n);
            if(n==1){
                return true;
            }
            else{
                if(set.contains(n)) return false;
                else {
                    set.add(n);
                    continue;
                }
            }
        }
        return false;
    }
    public int getSum(int n){
        int sum = 0;
        while(n>0){
           sum = sum+ (n%10)*(n%10); 
           n = n/10;
        }
        return sum;
    }
}
