class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2

        // Iterate over nums1 and swap with nums2 when needed
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                // Swap nums1[i] with nums2[j]
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;

                // Re-sort nums2 to maintain its sorted order
                int k = j;
                while (k < n - 1 && nums2[k] > nums2[k + 1]) {
                    int t = nums2[k];
                    nums2[k] = nums2[k + 1];
                    nums2[k + 1] = t;
                    k++;
                }
            }
            i++;
        }

        // Copy remaining elements of nums2 to nums1
        for (int k = 0; k < n; k++) {
            nums1[m + k] = nums2[k];
        }
    }
}
