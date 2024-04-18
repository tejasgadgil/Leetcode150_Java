import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Initialize a list to store the result
        List<List<Integer>> result = new ArrayList<>();
        // Sort the array to simplify the process of finding triplets
        Arrays.sort(nums);
        // Get the length of the array
        int n = nums.length;

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Skip duplicates to avoid duplicate triplets
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Initialize pointers for the left and right ends of the subarray
            int l = i + 1;
            int r = n - 1;

            // Use two pointers to find pairs that sum up to the target
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    // If the sum is greater than zero, move the right pointer to decrease the sum
                    r--;
                } else if (sum < 0) {
                    // If the sum is less than zero, move the left pointer to increase the sum
                    l++;
                } else {
                    // If the sum is zero, add the triplet to the result list
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    // Move the left pointer to the next unique element
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        // Return the list of triplets
        return result;
    }
}

// The time complexity is O(n^2), where n is the length of the input array nums, and the space complexity is O(1).
