class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        List<Integer> list = new ArrayList<>();
        for (int i = k - 1; i < nums.length; i++) {
            int max = nums[i - k + 1]; 
            for (int j = i - k + 1; j <= i; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            list.add(max); 
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}