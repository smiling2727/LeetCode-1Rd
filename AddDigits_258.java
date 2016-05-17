public class Solution {
    public int addDigits(int num) {
       int n =9;
       if(num==0||num%9!=0){
            n= num%9;
        }
    return n;
    }
}
