class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele: nums) {
            queue.offer(ele);
        }

        for(int i = 1;i<k;i++) {
            queue.poll();
        }

        return queue.peek();
    }
}
