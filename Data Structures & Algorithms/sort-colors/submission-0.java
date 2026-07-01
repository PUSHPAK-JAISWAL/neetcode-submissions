class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int index = 0;
        for(int i = 0;i<3;i++) {
            int count = map.getOrDefault(i, 0);
            while(count > 0) {
                nums[index] = i;
                index++;
                count--;
            }
        }
    }
}