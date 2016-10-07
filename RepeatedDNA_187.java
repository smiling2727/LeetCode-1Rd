import java.util.*;

public class repeatedDNA187 {
    /**
     * Created by Smiling on 10/6/16.
     */
    public List<String> findRepeatedDnaSequences(String s) {
        BSTree tree = new BSTree();
        List<String> rpList = new ArrayList<String>();

        for(int i=0;i<=s.length()-10;i++){
            String subStr = s.substring(i,i+10);
            System.out.println(subStr);
            tree.insert(subStr);
        }
        System.out.println("rpSet.size = "+tree.rpSet.size());
        Iterator it = tree.rpSet.iterator();

//        while(it.hasNext()){
//            //String addstr = it.next();
//            rpList.add((String)it.next());
//        }

//        for(String addStr:tree.rpSet){ //这种和上面那个iterator完全一样
//            rpList.add(addStr);
//        }

        return new ArrayList<>(tree.rpSet);//把set直接变成list
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        repeatedDNA187 r = new repeatedDNA187();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        //String s = "AAAAAAAAAAA";
        List list = r.findRepeatedDnaSequences(s);

    }

}

class BSTree{
    private BSTreeNode root;
    protected Set<String> rpSet = new HashSet<String>();

    public void insert(String str){
        root = insert(root,str);
    }

    public BSTreeNode insert(BSTreeNode root, String str){//insert with search
        if(root==null){
            root = new BSTreeNode(str);//构造新的子树（树）
            //System.out.println("insert "+ str);
            return root;
        }

        if(str.compareTo(root.data)<0) {
            root.left = insert(root.left,str);}
        else if(str.compareTo(root.data)>0){
            root.right = insert(root.right,str);}
        else{
            rpSet.add(str);
            System.out.println("equal "+str);
        }
        return root;
    }


}
class BSTreeNode{
    protected String data;
    protected BSTreeNode left;
    protected BSTreeNode right;

    public BSTreeNode(){
    }
    public BSTreeNode(String data){
        this.data = data;
    }
    public BSTreeNode(BSTreeNode left,BSTreeNode right,String data){
        this.left = left;
        this.right = right;
        this.data = data;
    }
}

