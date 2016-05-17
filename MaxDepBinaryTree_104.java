/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int count=0,max=0;
        TreeNode node = root;
        max = travelmid(root,count);
        return max;
    }
    
    public int travelmid(TreeNode node,int count){
        count++;
        if(node.left == null&&node.right==null){
            int max=node.val;
            return max;
        }
        else {
            travelmid(node.left,count);
            travelmid(node.right,count);
        }
        return -1;
    }
    
}
