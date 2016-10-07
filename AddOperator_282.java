
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by Smiling on 10/7/16.
 */

public class AddOperator_282 {

    public List<String> addOperators(String num, int target) {
        List<String> oList = new ArrayList<String>();
        char[] ch = num.toCharArray();
        int[] intList = new int[ch.length];
        for(int i=0;i<ch.length;i++){
            intList[i] = Integer.parseInt(String.valueOf(ch[i]));
        }
        return oList;
    }
    public static void main(String[] args) {
        TripleTree  t = new TripleTree();
        t.insert(1);
        t.insert(2);
        t.insert(3);

    }
}
class TreeNode{
    TreeNode left;
    TreeNode mid;
    TreeNode right;
    int data;
    public TreeNode(int data){
        this.data = data;
    }
    public TreeNode(TreeNode left,TreeNode mid,TreeNode right,int data){
        this.left = left;
        this.mid = mid;
        this.right = right;
        this.data = data;
    }
}
class TripleTree{
    TreeNode root;
    int d = 0;

    public void insert(int data){
        root = insert(root,data);
    }

    public TreeNode insert(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
            System.out.println(data);
            //d++;
            return root;
        }
        if (root.left==null)
            insert (root.left, root.data-data);

        if(root.mid==null)
            insert(root.mid, root.data+data);

        if(root.right==null)
            insert(root.right, root.data*data);
        //d++;
    return root;
    }

}