class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (r - l + 1 > k) {
            int distL = Math.abs(arr[l] - x);
            int distR = Math.abs(arr[r] - x);
            if (distL > distR) {
                l++;
            } else {
                r--;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}