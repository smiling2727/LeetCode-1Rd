public class Solution {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(i+countZero>=nums.length-1) return;
            else{
                if(nums[i]==0){
                 for(int j=i+1;j<nums.length-countZero;j++){
                    nums[j-1] = nums[j];//move everything forward
                  }
                  nums[nums.length-1-countZero] = 0;
                  countZero++;
                  i--;
                }
            }
        }
    }
}
