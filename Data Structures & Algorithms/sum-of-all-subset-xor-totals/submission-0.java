class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> sum = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1 << n; // This is equivalent to 2^n

        // Loop through all possible subset combinations (from 0 to 2^n - 1)
        for (int i = 0; i < totalSubsets; i++) {
            int xor = 0;
            // Check which elements belong to the current subset 'i'
            for (int j = 0; j < n; j++) {
                // If the j-th bit of 'i' is set, include nums[j]
                if ((i & (1 << j)) != 0) {
                    xor ^= nums[j];
                }
            }
            sum.add(xor);
        }

        int sum2 = 0;
        for (int ele : sum) {
            sum2 += ele;
        }
        return sum2;
    }
}
