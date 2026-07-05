class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r = 0;
        int l = 0;
        int sum = 0;
        int minCount = Integer.MAX_VALUE;
        for (r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                minCount = Math.min(minCount, r - l + 1);
                sum -= nums[l];
                l++;          
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
}