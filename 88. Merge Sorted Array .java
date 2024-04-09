class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1, nums2, and the merged array
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge arrays starting from the end to ensure in-place modification
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                // If the current element of nums1 is greater than the current element of nums2,
                // place it in the merged array at the end
                nums1[k--] = nums1[i--];
            } else {
                // Otherwise, place the current element of nums2 in the merged array at the end
                nums1[k--] = nums2[j--];
            }
        }
    }
}

// This solution efficiently merges the two arrays into nums1 in-place. 
// It iterates through both arrays once, leading to a time complexity of O(m + n), where m is the size of nums1 and n is the size of nums2. 
// Since the modification is done in-place, the space complexity is O(1).

// nums1 = [1, 2, 3, 0, 0, 0]
// m = 3
// nums2 = [2, 5, 6]
// n = 3

// Initial Values:
// i = 2
// j = 2
// k = 5
// nums1 = [1, 2, 3, 0, 0, 0]
// nums2 = [2, 5, 6]

// First Iteration:
// i = 2
// j = 2
// k = 5
// nums1 = [1, 2, 3, 0, 0, 6]
// nums2 = [2, 5, 6]

// Second Iteration:
// i = 2
// j = 1
// k = 4
// nums1 = [1, 2, 3, 0, 5, 6]
// nums2 = [2, 5, 6]

// Third Iteration:
// i = 2
// j = 0
// k = 3
// nums1 = [1, 2, 3, 3, 5, 6]
// nums2 = [2, 5, 6]

// Fourth Iteration:
// i = 1
// j = 0
// k = 2
// nums1 = [1, 2, 2, 3, 5, 6]
// nums2 = [2, 5, 6]

// Fifth Iteration:
// i = 0
// j = 0
// k = 1
// nums1 = [1, 2, 2, 3, 5, 6]
// nums2 = [2, 5, 6]

// Sixth Iteration:
// i = 0
// j = -1
// k = 0
// nums1 = [1, 2, 2, 3, 5, 6]
// nums2 = [2, 5, 6]
// At this point, the while loop terminates because j < 0. The arrays are merged, and nums1 becomes [1, 2, 2, 3, 5, 6].
