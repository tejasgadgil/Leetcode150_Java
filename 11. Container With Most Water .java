class Solution {
    public int maxArea(int[] height) {
        // Initialize pointers at the start and end of the array
        int l = 0;
        int r = height.length - 1;
        // Initialize the maximum volume of water
        int vol = (r - l) * Math.min(height[l], height[r]);
        
        // Iterate until the pointers meet
        while (l < r) {
            // Move the pointer pointing to the smaller height towards the other pointer
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
            // Calculate the volume of water trapped between the two lines and update the maximum volume
            vol = Math.max(vol, (r - l) * Math.min(height[l], height[r]));
        }
        // Return the maximum volume of water
        return vol;
    }
}

// The time complexity is O(n), where n is the length of the input array height. 
// And the space complexity is O(1).
