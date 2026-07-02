class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> uniqueSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int smallest = 1;
        for(int i = 0; i <= nums.length; i++) {
            if(uniqueSet.contains(smallest)) {
                smallest++;
            } else {
                return smallest;
            }
        }
        return smallest;
    }
}