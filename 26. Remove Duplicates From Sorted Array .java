class Solution {
    public int removeDuplicates(int[] nums) {
        // Get the length of the array
        int n = nums.length;
        // If the array has only one element, it's already unique
        if (n == 1) {
            return 1;
        }

        // Initialize the left pointer to 1 (index 1)
        int l = 1;

        // Iterate through the array starting from index 1
        for (int r = 1; r < n; r++) {
            // If the current number is different from the previous number
            if (nums[r] != nums[r - 1]) {
                // Update the number at the left pointer position with the current number
                nums[l] = nums[r];
                // Move the left pointer to the next position
                l++;
            }
        }
        // Return the length up to which the array contains unique elements
        return l;
    }
}


// Time Complexity:
// The time complexity of this solution is O(n), where n is the length of the input array 'nums'. This is because the algorithm iterates through each element of the array once.

// Space Complexity:
// The space complexity is O(1) because the extra space used does not grow with the size of the input. The algorithm uses only a constant amount of extra space for pointers and variables.
