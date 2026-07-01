class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys); 
        int index = 0;
        for (int key : sortedKeys) {
            int frequency = map.get(key);
            for (int i = 0; i < frequency; i++) {
                nums[index++] = key;
            }
        }
        return nums;
    }
}