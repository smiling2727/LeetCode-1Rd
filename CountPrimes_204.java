public class Solution {
    
    public int countPrimes(int n) {
        
        boolean[] isPrimes = new boolean[n];
        int counter=0;
        
        for(int i =2 ;i<n;i++){
            if(isPrimes[i]==false) counter++;
            for(int j=2;i*j<n;j++){
            isPrimes[i*j]=true;   
            }
        }
    return counter;
}
    
}
