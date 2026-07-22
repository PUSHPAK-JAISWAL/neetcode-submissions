class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] matrix1 = Arrays.stream(matrix)
                        .flatMapToInt(Arrays::stream)
                        .toArray();

        int l = 0;
        int r = matrix1.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (matrix1[mid] == target) {
                return true; 
            } else if (matrix1[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}