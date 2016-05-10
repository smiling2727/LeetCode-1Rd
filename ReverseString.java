//Write a function that takes a string as input and returns the string reversed.
//Example:
//Given s = "hello", return "olleh".

public class Solution {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        for(int i =0; i<c.length/2;i++){
            char temp = c[c.length-i-1];
            c[c.length-i-1] = c[i];
            c[i] = temp;
        }
       return String.valueOf(c);
    }
}
