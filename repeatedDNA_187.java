import java.util.*;

public class repeatedDNA_187 {
    /**
     * Created by Smiling on 10/6/16.
     */
    public List<String> findRepeatedDnaSequences(String s) {
        BSTree tree = new BSTree();
        List<String> rpList = new ArrayList<String>();

        for(int i=0;i<s.length()-9;i++){
            String subStr = s.substring(i,i+10);
            //System.out.println(subStr);
            tree.insert(subStr);
        }
        System.out.println("rpSet.size = "+tree.rpSet.size());
        Iterator it = tree.rpSet.iterator();
//        while(it.hasNext()){
//            //String addstr = it.next();
//            rpList.add((String)it.next());
//        }

        for(String addStr:tree.rpSet){ //这种和上面那个iterator完全一样
            rpList.add(addStr);
        }

        return rpList;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        repeatedDNA187 r = new repeatedDNA_187();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List list = r.findRepeatedDnaSequences(s);
//        System.out.println("list.size = "+list.size());
        //System.out.println(s.compareTo("ACAAACACCCAAAAACCCCCCAAAAAGGGTTT"));

//        BSTree BST = new BSTree();
//        String s1 = new String("AAAAACCCCC");
//        //String s2 = new String("AAAAACCCCC");
//        String s3 = new String("CCCCCAAAAA");
//        String s4 = new String("CCCCCAAAAA");
//        System.out.println(s1.compareTo(s3));
//        System.out.println(s3.compareTo(s4));
//        BST.insert(s1);
//        //BST.insert(s2);
//        BST.insert(s3);
//        BST.insert(s4);
    }

}

class BSTree{
    private BSTreeNode root;
    //protected List<String> replist = new ArrayList<String>();
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

