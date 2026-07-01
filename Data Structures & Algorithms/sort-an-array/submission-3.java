class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int minKey = Integer.MAX_VALUE;
        int maxKey = Integer.MIN_VALUE;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (i < minKey) minKey = i;
            if (i > maxKey) maxKey = i;
        }

        int range = maxKey - minKey + 1;
        int[] sortedKeysCount = new int[range];
        
        for (int key : map.keySet()) {
            sortedKeysCount[key - minKey] = 1; 
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            if (sortedKeysCount[i] == 1) {
                int actualKey = i + minKey;
                int frequency = map.get(actualKey);
                
                while (frequency > 0) {
                    nums[index++] = actualKey;
                    frequency--;
                }
            }
        }

        return nums;
    }
}