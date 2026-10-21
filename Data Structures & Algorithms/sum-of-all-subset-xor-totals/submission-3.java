class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> sum = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1 << n;

        for (int i = 0; i < totalSubsets; i++) {
            int xor = 0;
            for (int j = 0; j < n; j++) {
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
