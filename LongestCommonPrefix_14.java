public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(str.length==0) return null;
        if(str.length==1) return strs[0];
        boolean isSame = true;
        StringBuilder sbd = new StringBuilder();
        int i=0;
        while(isSame){
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(c!=str[j].charAt(i)){
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                sbd.append(c);
                i++;
            }else{
                break;
            }
        }
        return sbd.toString();
        
    }
}
