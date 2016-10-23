public class Solution {
    public void sortColors(int[] nums) {
        if (nums == null) return;
        int c0 = 0, c1 = 0;
        //int c2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0) c0++;
            if(nums[i]==1) c1++;
        }
        // c2 = nums.length - c0 - c1;
        // // System.out.println("c0 = "+c0);
        // // System.out.println("c1 = "+c1);
        // // System.out.println("c2 = "+c2);
        for(int i = 0; i < c0; i++){
            nums[i] = 0;
        }
        if(c1>0){
        for(int i = c0; i < c0+c1; i++){
            nums[i] = 1;
        }}
        if(nums.length>c0 + c1){
        for(int i = c0+c1; i < nums.length; i++){
            nums[i] = 2;
        }}
    }
}
