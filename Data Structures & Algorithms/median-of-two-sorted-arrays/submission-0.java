class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }

        for (int i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        
        int n = list.size();
        int mid = n / 2;
        
        if (n % 2 != 0) {
            return list.get(mid);
        } else {
            return (list.get(mid - 1) + list.get(mid)) / 2.0;
        }
    }
}
