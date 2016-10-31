public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perList = new ArrayList<List<Integer>>();
        boolean[] marks = new boolean[nums.length];
        //return backTrack(nums,marks,perList,new ArrayList<Integer>());
        backTrack(nums,marks,perList,new ArrayList<Integer>());
        return perList;
    }
    private void backTrack(int[] nums,boolean[] marks,List<List<Integer>> perList,List<Integer> curList){
        if(curList.size() == nums.length){
            perList.add(new ArrayList<Integer>(curList));
        //    return perList;
        }
        for(int i = 0;i<nums.length;i++){
            if(!marks[i]){
                marks[i] = true;
                curList.add(nums[i]);
                backTrack(nums,marks,perList,curList);
                marks[i] = false;
                curList.remove(curList.size()-1);
            }
        }
        // return perList;
    }
}
