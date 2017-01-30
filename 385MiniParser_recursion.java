import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution {
    Pattern pattern = Pattern.compile("\\[.*\\]");
    public NestedInteger deserialize(String s) {
       //remove bracket
       String str = s;
       Matcher matcher = pattern.matcher(str);
       while(matcher.matches()){
           if(str.length()<=2) return new NestedInteger();
           str = str.substring(1,s.length()-1);
           matcher = pattern.matcher(str);
       }
       //if(str.length()==0) return new NestedInteger();
       if(str.indexOf(',')==-1){
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
    // String str = s;
    // Matcher matcher = pattern.matcher(str);
    // while(matcher.matches()){
    //       str = str.substring(1,s.length()-1);
    //       matcher = pattern.matcher(str);
    // }
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
