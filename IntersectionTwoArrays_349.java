public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) { //o(n+m)
        Set<Integer> s = new HashSet<Integer>();
        Set<Integer> n = new HashSet<Integer>();
        for(int i : nums1){
            s.add(i);
        }
        for(int i : nums2){
            if(s.contains(i)){
                n.add(i);
            }
        }
   
    Object[] o = n.toArray();
    int[] a = new int[o.length];
    for(int i=0 ;i<o.length;i++){
        a[i] =(int) o[i];
    }
    return a;
    }
}
