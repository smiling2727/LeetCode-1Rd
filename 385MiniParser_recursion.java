/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public NestedInteger deserialize(String s) {
       String str = s.substring(1,s.length()-1);
       if(str.length()==0) return new NestedInteger();
       else if(str.indexOf(',')==-1){
           NestedInteger ni = new NestedInteger(Integer.parseInt(s));
           return ni;
       }else{
            NestedInteger nil = new NestedInteger();
            //String str = s.substring(1,s.length()-1);
            String[] tokens = str.split(",",2);
            int val = Integer.parseInt(tokens[0]);
            nil.add(new NestedInteger(val));
            return parser(tokens[1],nil);
       }
    }
    public NestedInteger parser(String s, NestedInteger nil){
    String str = s.substring(1,s.length()-1);
    //System.out.println(str);
    if(str.indexOf(',')==-1){
           nil.add(new NestedInteger(Integer.parseInt(str)));
           return nil;
    }
    else{
    String[] tokens = str.split(",",2);
    int val = Integer.parseInt(tokens[0]);
    nil.add(new NestedInteger(val));
    parser(tokens[1],nil);
    return nil;
    }}
}
