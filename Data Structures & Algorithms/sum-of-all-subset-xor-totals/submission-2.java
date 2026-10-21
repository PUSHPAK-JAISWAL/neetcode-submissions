class Solution {
    public int subsetXORSum(int[] nums) {
        // Map to store: Key = XOR sum, Value = Frequency of this XOR sum
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int n = nums.length;
        int totalSubsets = 1 << n; // 2^n

        for (int i = 0; i < totalSubsets; i++) {
            int xor = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    xor ^= nums[j];
                }
            }
            // Track how many times this specific XOR value occurs
            sumMap.put(xor, sumMap.getOrDefault(xor, 0) + 1);
        }

        int sum2 = 0;
        // Iterate through the map and multiply each XOR sum by its frequency
        for (Map.Entry<Integer, Integer> entry : sumMap.entrySet()) {
            int xorValue = entry.getKey();
            int frequency = entry.getValue();
            sum2 += (xorValue * frequency);
        }
        
        return sum2;
    }
}
