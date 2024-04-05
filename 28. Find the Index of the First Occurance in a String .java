class Solution {
    public int strStr(String haystack, String needle) {
        // Get the lengths of the haystack and needle
        int n = needle.length();
        int h = haystack.length();
        // If the length of the needle is greater than the length of the haystack,
        // the needle cannot be found in the haystack
        if (n > h) {
            return -1;
        }

        // Initialize a pointer for traversing the haystack
        int l = 0;

        // Iterate through the haystack until the remaining length is enough to accommodate the needle
        while (l < h - n + 1) {
            // If the current character in the haystack matches the first character of the needle
            if (haystack.charAt(l) == needle.charAt(0)) {
                int r = 0;
                // Compare subsequent characters of the haystack and needle until the needle is fully matched or there's a mismatch
                while (r < n && haystack.charAt(l + r) == needle.charAt(r)) {
                    r++;
                }
                // If all characters of the needle are matched, return the starting index of the match
                if (r == n) {
                    return l;
                }
            }
            l++;
        }

        // If the needle is not found in the haystack, return -1
        return -1;
    }
}


// Time Complexity:
// The time complexity of this solution is O((h - n) * n), where h is the length of the haystack and n is the length of the needle. This is because the algorithm iterates through each possible starting position of the needle in the haystack, and for each starting position, it compares at most n characters.

//   Space Complexity:
// The space complexity is O(1) because the extra space used does not depend on the size of the input. The algorithm uses only a constant amount of extra space for pointers and variables.
