public class Solution {
    int[] nums;
    List<Integer> numsList;

    public Solution(int[] nums) {
        this.nums = nums;
        numsList  = Arrays.stream(nums).boxed().collect(Collectors.toList() );
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        numsList  = Arrays.stream(nums).boxed().collect(Collectors.toList() );
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] after = new int[nums.length];
        int i=0;
        while(!numsList.isEmpty()){
            int index = (int)(Math.random()*(numsList.size()));
            after[i] = numsList.remove(index);
            i++;
        }
        numsList  = Arrays.stream(nums).boxed().collect(Collectors.toList() );
        return after;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
