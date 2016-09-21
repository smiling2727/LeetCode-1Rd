/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1 ;
        ListNode temp2 = l2 ;
        while(l2!=null&&l1!=null){//loop the small one
            if(l1.val + l2.val<10){
                l1.val =l1.val+l2.val;
                l2.val =l1.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            else{
                l1.val =(l1.val+l2.val)%10;
                l2.val =l1.val;
                moveDigit(l1);
                //moveDigit(l2);
                l1 = l1.next;
                l2 = l2.next;
            }
        }
         return l1!=null?temp1:temp2;
    }
    
    public void moveDigit(ListNode n){
        if(n.next==null) {
            n.next = new ListNode(1);
            return;
        }
        while((n.next.val+1)>=10){
            n.next.val = (n.next.val+1)%10;
            n = n.next;
            if(n.next ==null) n.next = new ListNode(0);
        }
        n.next.val++;
    }
    
}
