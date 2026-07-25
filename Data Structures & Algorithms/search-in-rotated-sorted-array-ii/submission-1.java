class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // FIX: Handle ambiguous duplicate case
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l++;
                r--;
                continue;
            }

            // Left half is sorted
            if (nums[l] <= nums[mid]) {
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } 
            // Right half is sorted
            else {
                if (target < nums[mid] || target > nums[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        return false;
    }
}