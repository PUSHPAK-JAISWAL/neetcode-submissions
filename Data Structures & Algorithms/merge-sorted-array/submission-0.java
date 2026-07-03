class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = 0;
        for(int i:nums2) {
            nums1[m+index] = i;
            index++;
        }
        Arrays.sort(nums1);

    }
}