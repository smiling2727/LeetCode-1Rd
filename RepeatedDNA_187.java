public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<String>();
        Set<String> repSet = new HashSet<String>();
        
        for(int i=0;i<s.length()-9;i++){
            String subStr = s.substring(i,i+10);
            if(seen.contains(subStr)){
                repSet.add(subStr);
            }
            else seen.add(subStr);
            
        }
        return new ArrayList<>(repSet);
    }
}

