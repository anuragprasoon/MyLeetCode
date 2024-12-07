class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        int mid1 = 0, mid2 = 0;
        
        // Find the middle positions
        int targetPosition = (m + n) / 2;
        
        // Track current position in merged array
        int count = 0;
        
        // Keep going until we find the middle element(s)
        while (count <= targetPosition) {
            // Store previous median for even length case
            mid2 = mid1;
            
            if (i == m) {
                mid1 = nums2[j];
                j++;
            } else if (j == n) {
                mid1 = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                mid1 = nums1[i];
                i++;
            } else {
                mid1 = nums2[j];
                j++;
            }
            count++;
        }
        
        // If total length is odd, return middle element
        if ((m + n) % 2 == 1) {
            return mid1;
        }
        // If even, return average of middle two elements
        return (mid1 + mid2) / 2.0;
    }
}